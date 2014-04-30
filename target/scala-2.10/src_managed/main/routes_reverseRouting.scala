// @SOURCE:/Users/mac/University/3_course/2sem/Java/DiagramCreator/conf/routes
// @HASH:b230f89fe2a65938ed2d678b100e3aeb693a1688
// @DATE:Wed Apr 30 09:50:14 MSK 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:8
// @LINE:6
package controllers {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:19
def authorizeUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:8
def authorizedIndex(login:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + implicitly[PathBindable[String]].unbind("login", dynamicString(login)))
}
                                                

// @LINE:16
def saveUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                

// @LINE:13
def submit(step:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login/" + implicitly[PathBindable[Int]].unbind("step", step))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:19
def authorizeUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authorizeUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:8
def authorizedIndex : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.authorizedIndex",
   """
      function(login) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("login", encodeURIComponent(login))})
      }
   """
)
                        

// @LINE:16
def saveUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.saveUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:13
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.submit",
   """
      function(step) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("step", step)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:11
class ReverseAssets {
    

// @LINE:11
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:19
// @LINE:16
// @LINE:13
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:19
def authorizeUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authorizeUser(), HandlerDef(this, "controllers.Application", "authorizeUser", Seq(), "POST", """Authorization""", _prefix + """login""")
)
                      

// @LINE:8
def authorizedIndex(login:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.authorizedIndex(login), HandlerDef(this, "controllers.Application", "authorizedIndex", Seq(classOf[String]), "GET", """""", _prefix + """$login<[^/]+>""")
)
                      

// @LINE:16
def saveUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.saveUser(), HandlerDef(this, "controllers.Application", "saveUser", Seq(), "POST", """Saving new User""", _prefix + """login""")
)
                      

// @LINE:13
def submit(step:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.submit(step), HandlerDef(this, "controllers.Application", "submit", Seq(classOf[Int]), "POST", """""", _prefix + """login/$step<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    