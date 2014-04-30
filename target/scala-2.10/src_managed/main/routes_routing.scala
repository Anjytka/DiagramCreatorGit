// @SOURCE:/Users/mac/University/3_course/2sem/Java/DiagramCreator/conf/routes
// @HASH:b230f89fe2a65938ed2d678b100e3aeb693a1688
// @DATE:Wed Apr 30 09:50:14 MSK 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Application_authorizedIndex1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),DynamicPart("login", """[^/]+""",true))))
        

// @LINE:11
private[this] lazy val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        

// @LINE:13
private[this] lazy val controllers_Application_submit3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login/"),DynamicPart("step", """[^/]+""",true))))
        

// @LINE:16
private[this] lazy val controllers_Application_saveUser4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:19
private[this] lazy val controllers_Application_authorizeUser5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """$login<[^/]+>""","""controllers.Application.authorizedIndex(login:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login/$step<[^/]+>""","""controllers.Application.submit(step:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.saveUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authorizeUser()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Application_authorizedIndex1(params) => {
   call(params.fromPath[String]("login", None)) { (login) =>
        invokeHandler(controllers.Application.authorizedIndex(login), HandlerDef(this, "controllers.Application", "authorizedIndex", Seq(classOf[String]),"GET", """""", Routes.prefix + """$login<[^/]+>"""))
   }
}
        

// @LINE:11
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        

// @LINE:13
case controllers_Application_submit3(params) => {
   call(params.fromPath[Int]("step", None)) { (step) =>
        invokeHandler(controllers.Application.submit(step), HandlerDef(this, "controllers.Application", "submit", Seq(classOf[Int]),"POST", """""", Routes.prefix + """login/$step<[^/]+>"""))
   }
}
        

// @LINE:16
case controllers_Application_saveUser4(params) => {
   call { 
        invokeHandler(controllers.Application.saveUser(), HandlerDef(this, "controllers.Application", "saveUser", Nil,"POST", """Saving new User""", Routes.prefix + """login"""))
   }
}
        

// @LINE:19
case controllers_Application_authorizeUser5(params) => {
   call { 
        invokeHandler(controllers.Application.authorizeUser(), HandlerDef(this, "controllers.Application", "authorizeUser", Nil,"POST", """Authorization""", Routes.prefix + """login"""))
   }
}
        
}

}
     