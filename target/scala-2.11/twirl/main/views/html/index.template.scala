
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html data-ng-app="app" data-ng-controller="AppCtrl">
<head>
	<meta charset="UTF-8">
	<title>The Eventual PlayFramework-AngularJS-MongoDB Seed Project</title>
	<link rel="stylesheet" media="screen" href=""""),_display_(/*6.47*/routes/*6.53*/.Assets.at("third/bootstrap/css/bootstrap.min.css")),format.raw/*6.104*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*7.47*/routes/*7.53*/.Assets.at("third/bootstrap/css/bootstrap-theme.min.css")),format.raw/*7.110*/("""">
	<link rel="stylesheet" media="screen" href=""""),_display_(/*8.47*/routes/*8.53*/.Assets.at("stylesheets/main.css")),format.raw/*8.87*/("""">
	<link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.52*/routes/*9.58*/.Assets.at("images/favicon.png")),format.raw/*9.90*/("""">
</head>
<body>

<!-- menu -->
    <div class="navbar navbar-default navbar-static-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">omp4j</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li><a href="home">Home</a></li>
            <li><a href="download">Download</a></li>
            <li><a href="tutorial">Tutorial</a></li>
            <li><a href="api">API doc</a></li>
            <li><a href="authors">Authors</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="https://github.com/omp4j/omp4j" target="_blank">Source</a></li>
            <li><a href="demo">Demo</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
<!-- /menu -->

	<div role="main" class="container">
		<div class="row">
			<div class="span12">
				<!-- as the route changes, the AngularJS view will be dynamically rendered and populated -->
				<div data-ng-view></div>
			</div>
		</div>
	</div>
	
	<script src=""""),_display_(/*51.16*/routes/*51.22*/.Assets.at("third/jquery/jquery-1.10.2.min.js")),format.raw/*51.69*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*52.16*/routes/*52.22*/.Assets.at("third/bootstrap/js/bootstrap.min.js")),format.raw/*52.71*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*53.16*/routes/*53.22*/.Assets.at("third/angularjs/angular.min.js")),format.raw/*53.66*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*54.16*/routes/*54.22*/.Assets.at("third/angularjs/angular-resource.min.js")),format.raw/*54.75*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*55.16*/routes/*55.22*/.Assets.at("javascripts/main.js")),format.raw/*55.55*/("""" type="text/javascript"></script>
</body>
</html>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Sep 02 21:31:50 CEST 2014
                  SOURCE: /home/petr/Dropbox/omp4j/www/app/views/index.scala.html
                  HASH: e4ef4093831d37af574b799f959b616e3e4e1776
                  MATRIX: 580->0|827->221|841->227|913->278|988->327|1002->333|1080->390|1155->439|1169->445|1223->479|1303->533|1317->539|1369->571|2835->2010|2850->2016|2918->2063|2995->2113|3010->2119|3080->2168|3157->2218|3172->2224|3237->2268|3314->2318|3329->2324|3403->2377|3480->2427|3495->2433|3549->2466
                  LINES: 22->1|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|72->51|72->51|72->51|73->52|73->52|73->52|74->53|74->53|74->53|75->54|75->54|75->54|76->55|76->55|76->55
                  -- GENERATED --
              */
          