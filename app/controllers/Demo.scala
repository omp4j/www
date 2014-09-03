package controllers

import scala.concurrent.ExecutionContext.Implicits.global

import play.api.libs.json.Json
import play.api.mvc.Action
import play.api.mvc.Controller

object Demo extends Controller {
	def translate = Action(parse.json) { implicit request =>
		// Async {
			val source = request.body.\("source")
			val result = s"Result from server! Original request: $source"	// TODO
			Ok(result)
			// Ok(Json.toJson(result))
		// }
	}
}
