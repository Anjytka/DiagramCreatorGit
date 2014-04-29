
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
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[userModel],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(userForm: Form[userModel]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Home")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""
		
    	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    	<div class="navbar-inner">
			<div class="container">
			    <a class="navbar-brand" href="#" width="321" height="50"><img alt="" src="images/DCIcon.png" width="321" height="50"></a>
				<div class="collapse navbar-collapse">
					<a class="brand" href=""></a>
					<form class="navbar-form pull-right">
							<a data-toggle="modal" data-target="#regDialog">
						    	Регистрация
				    		</a>
						    <a  data-toggle="modal" data-target="#entDialog">
						   		Вход
						   	</a>
						</form>
				</div>
			</div>
			</div>
		</div>
		
    	<div class="modal fade" id="regDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">Регистрация</h4>
		      </div>
		      <div class="modal-body">
		        """),_display_(Seq[Any](/*34.12*/form(routes.Application.saveUser())/*34.47*/ {_display_(Seq[Any](format.raw/*34.49*/("""
				    """),_display_(Seq[Any](/*35.10*/inputText(userForm("login"),
				    		'_label -> "Логин",
                			'_help -> "Введите пароль"))),format.raw/*37.47*/("""
                	"""),_display_(Seq[Any](/*38.19*/inputText(userForm("email"),
                			'_label -> "Email",
                			'_help -> "Введите адрес электронной почты"))),format.raw/*40.64*/("""
                	"""),_display_(Seq[Any](/*41.19*/inputText(userForm("password"),
				    		'_label -> "Пароль",
                			'_help -> "Минимальная длинна пароля 8 символов"))),format.raw/*43.69*/("""
				    <input type="submit" value="Создать">
				""")))})),format.raw/*45.6*/("""
		      </div>
		    </div>
		  </div>
		</div>

""")))})),format.raw/*51.2*/("""
"""))}
    }
    
    def render(userForm:Form[userModel]): play.api.templates.HtmlFormat.Appendable = apply(userForm)
    
    def f:((Form[userModel]) => play.api.templates.HtmlFormat.Appendable) = (userForm) => apply(userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Apr 29 22:45:53 MSK 2014
                    SOURCE: /Users/mac/University/3_course/2sem/Java/DiagramCreator/app/views/index.scala.html
                    HASH: 59a134d4ec5fb6f04ac2d9960a350e9f8289a230
                    MATRIX: 783->1|920->28|948->47|984->49|1004->61|1043->63|2164->1148|2208->1183|2248->1185|2294->1195|2421->1300|2476->1319|2629->1450|2684->1469|2837->1600|2920->1652|3002->1703
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|62->34|62->34|62->34|63->35|65->37|66->38|68->40|69->41|71->43|73->45|79->51
                    -- GENERATED --
                */
            