// @SOURCE:/home/petr/Dropbox/omp4j/www/conf/routes
// @HASH:12130a4e8af0431d3c97e220073f84f13c4d60a3
// @DATE:Wed Sep 03 11:01:10 CEST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:17
// @LINE:14
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:7
class ReverseDemo {


// @LINE:7
def translate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "demo/translate")
}
                        

}
                          

// @LINE:14
class ReverseAssets {


// @LINE:14
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:17
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:8
def loadPublicHTML(any:String): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "views/" + implicitly[PathBindable[String]].unbind("any", any))
}
                        

// @LINE:17
// @LINE:6
def index(any:String): Call = {
   (any: @unchecked) match {
// @LINE:6
case (any) if any == "none" =>
  implicit val _rrc = new ReverseRouteContext(Map(("any", "none")))
  Call("GET", _prefix)
                                         
// @LINE:17
case (any)  =>
  import ReverseRouteContext.empty
  Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("any", any))
                                         
   }
}
                                                

}
                          
}
                  


// @LINE:17
// @LINE:14
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:7
class ReverseDemo {


// @LINE:7
def translate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Demo.translate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "demo/translate"})
      }
   """
)
                        

}
              

// @LINE:14
class ReverseAssets {


// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:8
def loadPublicHTML : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.loadPublicHTML",
   """
      function(any) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "views/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("any", any)})
      }
   """
)
                        

// @LINE:17
// @LINE:6
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
        


// @LINE:17
// @LINE:14
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:7
class ReverseDemo {


// @LINE:7
def translate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Demo.translate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Demo", "translate", Seq(), "POST", """""", _prefix + """demo/translate""")
)
                      

}
                          

// @LINE:14
class ReverseAssets {


// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:17
// @LINE:8
// @LINE:6
class ReverseApplication {


// @LINE:8
def loadPublicHTML(any:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.loadPublicHTML(any), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "loadPublicHTML", Seq(classOf[String]), "GET", """""", _prefix + """views/$any<.+>""")
)
                      

// @LINE:6
def index(any:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(any), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(classOf[String]), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    