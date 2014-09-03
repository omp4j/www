// @SOURCE:/home/petr/Dropbox/omp4j/www/conf/routes
// @HASH:d4cf6746cee38d579c0221eb3a89e91eed48c708
// @DATE:Wed Sep 03 13:10:01 CEST 2014


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:2
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(classOf[String]),"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:3
private[this] lazy val controllers_Demo_translate1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("demo/translate"))))
private[this] lazy val controllers_Demo_translate1_invoker = createInvoker(
controllers.Demo.translate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "translate", Nil,"POST", """""", Routes.prefix + """demo/translate"""))
        

// @LINE:4
private[this] lazy val controllers_Application_loadPublicHTML2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("views/"),DynamicPart("any", """.+""",false))))
private[this] lazy val controllers_Application_loadPublicHTML2_invoker = createInvoker(
controllers.Application.loadPublicHTML(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loadPublicHTML", Seq(classOf[String]),"GET", """""", Routes.prefix + """views/$any<.+>"""))
        

// @LINE:5
private[this] lazy val controllers_Assets_at3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_index4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("any", """.+""",false))))
private[this] lazy val controllers_Application_index4_invoker = createInvoker(
controllers.Application.index(fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(classOf[String]),"GET", """ Redirect all unknown routes to the index page""", Routes.prefix + """$any<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index(any:String = "none")"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """demo/translate""","""controllers.Demo.translate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """views/$any<.+>""","""controllers.Application.loadPublicHTML(any:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$any<.+>""","""controllers.Application.index(any:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:2
case controllers_Application_index0_route(params) => {
   call(Param[String]("any", Right("none"))) { (any) =>
        controllers_Application_index0_invoker.call(controllers.Application.index(any))
   }
}
        

// @LINE:3
case controllers_Demo_translate1_route(params) => {
   call { 
        controllers_Demo_translate1_invoker.call(controllers.Demo.translate)
   }
}
        

// @LINE:4
case controllers_Application_loadPublicHTML2_route(params) => {
   call(params.fromPath[String]("any", None)) { (any) =>
        controllers_Application_loadPublicHTML2_invoker.call(controllers.Application.loadPublicHTML(any))
   }
}
        

// @LINE:5
case controllers_Assets_at3_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at3_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:8
case controllers_Application_index4_route(params) => {
   call(params.fromPath[String]("any", None)) { (any) =>
        controllers_Application_index4_invoker.call(controllers.Application.index(any))
   }
}
        
}

}
     