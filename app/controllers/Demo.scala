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
		var toDelete: List[File] = null
		var conf: Config = null

		val writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f_in)))

		try {
			val source: play.api.libs.json.JsValue = request.body.\("source")

			val code: String = source.toString
			writer.write(StringContext treatEscapes code.substring(1, code.length-1))
			writer.flush()

			conf = new Config(Array("-d", System.getProperty("java.io.tmpdir"), "--source-only", f_in.getAbsolutePath))     // set up configuration based on program arguments
			val prep = new Preprocessor()(conf)     // create preprocessor

			val (translatedFiles, dirs) = prep.run()
			val tmpDirs :+ ((tmpDir, prepDir)) :+ ((lastDir, lastPrepDir)): List[(File, File)] = dirs
			toDelete = tmpDir :: prepDir :: lastDir :: lastPrepDir :: tmpDirs.foldLeft[List[File]](List()){ case (z, (a,b)) => a :: b :: z}

			f_out = translatedFiles.head
			val output = scala.io.Source.fromFile(f_out).mkString
			Ok(output)

		} catch {
			case e: Exception => Ok(e.getMessage)
		} finally {
			writer.close()

			try f_in.delete()
			catch {case e: NullPointerException => ; }

			try f_out.delete()
			catch {case e: NullPointerException => ; }

			try toDelete.foreach(FileTreeWalker.recursiveDelete)
			catch {case e: NullPointerException => ; }

			try FileTreeWalker.recursiveDelete(conf.workDir)
			catch {case e: NullPointerException => ; }
		}
	}
}
