// @SOURCE:/home/petr/Dropbox/omp4j/www/conf/routes
// @HASH:d4cf6746cee38d579c0221eb3a89e91eed48c708
// @DATE:Wed Sep 03 12:49:41 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:8
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
package controllers {

// @LINE:3
class ReverseDemo {


// @LINE:3
def translate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "demo/translate")
}
                        

}
                          

// @LINE:5
class ReverseAssets {


// @LINE:5
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:8
// @LINE:4
// @LINE:2
class ReverseApplication {


// @LINE:4
def loadPublicHTML(any:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "views/" + implicitly[PathBindable[String]].unbind("any", any))
}
                        

// @LINE:8
// @LINE:2
def index(any:String): Call = {
   (any: @unchecked) match {
// @LINE:2
case (any) if any == "none" =>
  implicit val _rrc = new ReverseRouteContext(Map(("any", "none")))
  Call("GET", _prefix)
                                         
// @LINE:8
case (any)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("any", any))
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:8
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:3
class ReverseDemo {


// @LINE:3
def translate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.translate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "demo/translate"})
      }
   """
)
                        

}
              

// @LINE:5
class ReverseAssets {


// @LINE:5
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:8
// @LINE:4
// @LINE:2
class ReverseApplication {


// @LINE:4
def loadPublicHTML : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadPublicHTML",
   """
      function(any) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("any", any)})
      }
   """
)
                        

// @LINE:8
// @LINE:2
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function(any) {
      if (any == """ + implicitly[JavascriptLitteral[String]].to("none") + """) {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
      if (true) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("any", any)})
      }
      }
   """
)
                        

}
              
}
        


// @LINE:8
// @LINE:5
// @LINE:4
// @LINE:3
// @LINE:2
package controllers.ref {


// @LINE:3
class ReverseDemo {


// @LINE:3
def translate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.translate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "translate", Seq(), "POST", """""", _prefix + """demo/translate""")
)
                      

}
                          

// @LINE:5
class ReverseAssets {


// @LINE:5
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:8
// @LINE:4
// @LINE:2
class ReverseApplication {


// @LINE:4
def loadPublicHTML(any:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadPublicHTML(any), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loadPublicHTML", Seq(classOf[String]), "GET", """""", _prefix + """views/$any<.+>""")
)
                      

// @LINE:2
def index(any:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(any), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    