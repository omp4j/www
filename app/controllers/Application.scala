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
	def getURL(any: String, host: String=""): URL = new URL(s"http://$host/public/html/$any.html")

	/** load an HTML page from public/html */
	def loadPublicHTML(any: String) = Action { implicit request =>
		val url = getURL(any, request.host)
		Ok(scala.io.Source.fromURL(url).mkString).as("text/html");
	}
}
