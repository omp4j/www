
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
	<title>omp4j</title>
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
            <li><a href="home">Home <span class="glyphicon glyphicon-home"></a></li>
            <li><a href="download">Download <span class="glyphicon glyphicon-cloud-download"></a></li>
            <li><a href="tutorial">Tutorial <span class="glyphicon glyphicon-book"></a></li>
            <li><a href="api">API doc <span class="glyphicon glyphicon-info-sign"></a></li>
            <li><a href="authors">Authors <span class="glyphicon glyphicon-user"></a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="https://github.com/omp4j/omp4j" target="_blank">Source <span class="glyphicon glyphicon-cloud"></a></li>
            <li><a href="demo">Demo <span class="glyphicon glyphicon-cloud-upload"></span></a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
<!-- /menu -->

	<div role="main" class="container">
				<div data-ng-view></div>
	</div>
	
	<script src=""""),_display_(/*46.16*/routes/*46.22*/.Assets.at("third/jquery/jquery-1.10.2.min.js")),format.raw/*46.69*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*47.16*/routes/*47.22*/.Assets.at("third/bootstrap/js/bootstrap.min.js")),format.raw/*47.71*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*48.16*/routes/*48.22*/.Assets.at("third/angularjs/angular.min.js")),format.raw/*48.66*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*49.16*/routes/*49.22*/.Assets.at("third/angularjs/angular-resource.min.js")),format.raw/*49.75*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*50.16*/routes/*50.22*/.Assets.at("javascripts/main.js")),format.raw/*50.55*/("""" type="text/javascript"></script>
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
                  DATE: Wed Sep 03 12:49:42 CEST 2014
                  SOURCE: /home/petr/Dropbox/omp4j/www/app/views/index.scala.html
                  HASH: 52e230649a3c7958e7f95ce7e5c42de779a9db52
                  MATRIX: 580->0|775->169|789->175|861->226|936->275|950->281|1028->338|1103->387|1117->393|1171->427|1251->481|1265->487|1317->519|2934->2109|2949->2115|3017->2162|3094->2212|3109->2218|3179->2267|3256->2317|3271->2323|3336->2367|3413->2417|3428->2423|3502->2476|3579->2526|3594->2532|3648->2565
                  LINES: 22->1|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|67->46|67->46|67->46|68->47|68->47|68->47|69->48|69->48|69->48|70->49|70->49|70->49|71->50|71->50|71->50
                  -- GENERATED --
              */
          