package controllers

import play.api.libs.json.Json
import play.api.mvc.Action
import play.api.mvc.Controller

object Demo extends Controller {
	def translate(code: String) = Action { implicit request =>
		Ok(views.html.index())
	}
}
