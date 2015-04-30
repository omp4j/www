package controllers

import java.io._

import scala.collection.immutable.::
import scala.concurrent.ExecutionContext.Implicits.global

import play.api.libs.json.Json
import play.api.mvc.Action
import play.api.mvc.Controller
import play.api.libs.Files.TemporaryFile

import org.omp4j.Config
import org.omp4j.preprocessor.Preprocessor
import org.omp4j.utils.FileTreeWalker

object Demo extends Controller {
	def translate = Action(parse.json) { implicit request =>
		val f_in = File.createTempFile("pre", ".java")
		var f_out: File = null
		var tmpDir2delete: File = null

		val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f_in)))


		try {
			val source: play.api.libs.json.JsValue = request.body.\("source")

			val code: String = source.toString
			writer.write(StringContext treatEscapes code.substring(1, code.length-1))
			writer.flush()

			val conf = new Config(Array("-d", System.getProperty("java.io.tmpdir"), "--source-only", f_in.getAbsolutePath))     // set up configuration based on program arguments
			val prep = new Preprocessor()(conf)     // create preprocessor

			val (outfiles, (tmpDir, prepDir)::_) = prep.run()        // fetch the array of (already saved) preprocessed files
			f_out = outfiles.head
			tmpDir2delete = tmpDir

			val output = scala.io.Source.fromFile(f_out).mkString
			Ok(output)

		} catch {
			case e: Exception => Ok(e.getMessage)
		} finally {
			writer.close()
			f_in.delete()
			f_out.delete()
			FileTreeWalker.recursiveDelete(tmpDir2delete)

		}
	}
}
