
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/* about Template File */
object about extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /* about Template File */
    def apply/*2.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*2.19*/("""

Hello, guest, the meccage is: """),_display_(Seq[Any](/*4.32*/message)),format.raw/*4.39*/(""";
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 29 20:38:28 MSK 2014
                    SOURCE: /Users/mac/University/3_course/2sem/Java/DiagramCreator/app/views/about.scala.html
                    HASH: 6fc8b03329d2155c1c9cc6b1b566bfc2bce980aa
                    MATRIX: 816->27|927->44|995->77|1023->84
                    LINES: 26->2|29->2|31->4|31->4
                    -- GENERATED --
                */
            