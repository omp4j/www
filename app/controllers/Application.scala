package controllers

import java.io.File

import play.Play
import play.api.mvc.Action
import play.api.mvc.Controller

object Application extends Controller {

	/** serve the index page app/views/index.scala.html */
	def index(any: String) = Action { Ok(views.html.index()) }

	/** resolve "any" into the corresponding HTML page URI */
	def getURI(any: String): String = s"/public/html/$any.html"

	/** load an HTML page from public/html */
	def loadPublicHTML(any: String) = Action {
		val projectRoot = Play.application.path()
		var file = new File(projectRoot + getURI(any))
		println(file.getAbsolutePath())
		println(file.exists())
		if (file.exists())
			Ok(scala.io.Source.fromFile(file.getCanonicalPath(), "UTF-8").mkString).as("text/html");
		else
			NotFound
	}
}
