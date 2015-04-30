package controllers

import java.io.File
import java.net._

import play.Play
import play.api.mvc.Action
import play.api.mvc.Controller

object Application extends Controller {

	/** serve the index page app/views/index.scala.html */
	def index(any: String) = Action { Ok(views.html.index()) }

	/** resolve "any" into the corresponding HTML page URI */
	def getURI(any: String, host: String=""): String = s"$host/public/html/$any.html"

	/** load an HTML page from public/html */
	def loadPublicHTML(any: String) = Action { implicit request =>
		//val projectRoot = Play.application.path()
		//var file = new File(projectRoot + getURI(any))
		//var file = new File(getURI(any, request.host))


		val url = new URL("http://" + getURI(any, request.host))
		println(url)

		//if (file.exists())
			//Ok(scala.io.Source.fromFile(file.getCanonicalPath(), "UTF-8").mkString).as("text/html");
			Ok(scala.io.Source.fromURL(url).mkString).as("text/html");
		//else
		//	NotFound
	}
}
