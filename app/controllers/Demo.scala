package controllers

import scala.collection.immutable.::
import scala.concurrent.ExecutionContext.Implicits.global

import play.api.libs.json.Json
import play.api.mvc.Action
import play.api.mvc.Controller
import play.api.libs.Files.TemporaryFile
import java.io._
import org.omp4j.Config
import org.omp4j.preprocessor.Preprocessor

object Demo extends Controller {
	def translate = Action(parse.json) { implicit request =>
		val f_in = File.createTempFile("pre", ".java")
		//val f_out = File.createTempFile("post", ".java")

		val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f_in)))


		try {
			val source: play.api.libs.json.JsValue = request.body.\("source")

			val code: String = source.toString
			writer.write(StringContext treatEscapes code.substring(1, code.length-1))
			/*
			code.substring(1, code.length-1).split("""\\n""").foreach{ chunk =>
				writer write (StringContext treatEscapes chunk)
				writer.newLine()
			}*/
			writer.flush()

			val conf = new Config(Array("-d", System.getProperty("java.io.tmpdir"), "--source-only", f_in.getAbsolutePath))     // set up configuration based on program arguments
			val prep = new Preprocessor()(conf)     // create preprocessor

			val (outfiles, (tmpDir, prepDir)::_) = prep.run()        // fetch the array of (already saved) preprocessed files
			val f_out: File = outfiles.head

			val output = scala.io.Source.fromFile(f_out).mkString
			Ok(output)

		} catch {
			case e: Exception => Ok(e.getMessage)
		} finally {
			writer.close()
		}
	}
}
