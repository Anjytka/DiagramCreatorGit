
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Form[userModel],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(login:String, userForm: Form[userModel]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Home")/*5.14*/ {_display_(Seq[Any](format.raw/*5.16*/("""
		
    	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    	<div class="navbar-inner">
			<div class="container">
			    <a class="navbar-brand" href="#" width="321" height="50"><img alt="" src="images/DCIcon.png" width="321" height="50"></a>
				<div class="collapse navbar-collapse">
					<a class="brand" href=""></a>
					<form class="navbar-form pull-right">
							"""),_display_(Seq[Any](/*14.9*/if(login == "")/*14.24*/ {_display_(Seq[Any](format.raw/*14.26*/("""
							<a data-toggle="modal" data-target="#regDialog">
						    	Регистрация
				    		</a>
						    <a  data-toggle="modal" data-target="#entDialog">
						   		Вход
						   	</a>
						   	""")))}/*21.13*/else/*21.18*/{_display_(Seq[Any](format.raw/*21.19*/("""
						   		<a>
							    	"""),_display_(Seq[Any](/*23.14*/login)),format.raw/*23.19*/("""
					    		</a>
							    <a href=""""),_display_(Seq[Any](/*25.22*/routes/*25.28*/.Application.index)),format.raw/*25.46*/("""">
							   		Выход
							   	</a>
						   	""")))})),format.raw/*28.12*/("""
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
		        """),_display_(Seq[Any](/*43.12*/form(routes.Application.saveUser())/*43.47*/ {_display_(Seq[Any](format.raw/*43.49*/("""
				    """),_display_(Seq[Any](/*44.10*/inputText(userForm("login"),
				    		'_label -> "Логин",
                			'_help -> "Введите логин"))),format.raw/*46.46*/("""
                	"""),_display_(Seq[Any](/*47.19*/inputText(userForm("email"),
                			'_label -> "Email",
                			'_help -> "Введите адрес электронной почты"))),format.raw/*49.64*/("""
                	"""),_display_(Seq[Any](/*50.19*/inputText(userForm("password"),
				    		'_label -> "Пароль",
                			'_help -> "Минимальная длинна пароля 8 символов"))),format.raw/*52.69*/("""
				    <input type="submit" value="Создать">
				    <input type="button" class="cancelBtn" value="Отменить">
				""")))})),format.raw/*55.6*/("""
		      </div>
		    </div>
		  </div>
		</div>
		
		<div class="modal fade" id="entDialog" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title" id="myModalLabel">Вход</h4>
		      </div>
		      <div class="modal-body">
		        """),_display_(Seq[Any](/*69.12*/form(routes.Application.authorizeUser())/*69.52*/ {_display_(Seq[Any](format.raw/*69.54*/("""
				    """),_display_(Seq[Any](/*70.10*/inputText(userForm("login"),
				    		'_label -> "Логин",
                			'_help -> "Введите логин"))),format.raw/*72.46*/("""
                	"""),_display_(Seq[Any](/*73.19*/inputText(userForm("password"),
				    		'_label -> "Пароль",
                			'_help -> "Введите пароль"))),format.raw/*75.47*/("""
				    <input type="submit" value="Вход">
				    <input type="button" class="cancelBtn" value="Отменить">
				""")))})),format.raw/*78.6*/("""
		      </div>
		    </div>
		  </div>
		</div>

	<script type="text/javascript" charset="utf-8">
		
		$(".cancelBtn").click(function()"""),format.raw/*86.35*/("""{"""),format.raw/*86.36*/("""
			$("div.in").attr("class","modal fade").attr("aria-hidden","true");
		"""),format.raw/*88.3*/("""}"""),format.raw/*88.4*/(""");
	
	</script>

""")))})),format.raw/*92.2*/("""
"""))}
    }
    
    def render(login:String,userForm:Form[userModel]): play.api.templates.HtmlFormat.Appendable = apply(login,userForm)
    
    def f:((String,Form[userModel]) => play.api.templates.HtmlFormat.Appendable) = (login,userForm) => apply(login,userForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Apr 30 09:57:21 MSK 2014
                    SOURCE: /Users/mac/University/3_course/2sem/Java/DiagramCreator/app/views/index.scala.html
                    HASH: c074c0f7d12b25e4bb09d774ca96a569cae7b292
                    MATRIX: 790->1|941->42|969->61|1005->63|1025->75|1064->77|1496->474|1520->489|1560->491|1776->689|1789->694|1828->695|1893->724|1920->729|1994->767|2009->773|2049->791|2129->839|2674->1348|2718->1383|2758->1385|2804->1395|2930->1499|2985->1518|3138->1649|3193->1668|3346->1799|3494->1916|4026->2412|4075->2452|4115->2454|4161->2464|4287->2568|4342->2587|4473->2696|4618->2810|4782->2946|4811->2947|4911->3020|4939->3021|4988->3039
                    LINES: 26->1|30->1|32->4|33->5|33->5|33->5|42->14|42->14|42->14|49->21|49->21|49->21|51->23|51->23|53->25|53->25|53->25|56->28|71->43|71->43|71->43|72->44|74->46|75->47|77->49|78->50|80->52|83->55|97->69|97->69|97->69|98->70|100->72|101->73|103->75|106->78|114->86|114->86|116->88|116->88|120->92
                    -- GENERATED --
                */
            