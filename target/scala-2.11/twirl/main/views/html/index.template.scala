
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
					<li><a href="authors">Authors <span class="glyphicon glyphicon-user"></a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="api">API doc <span class="glyphicon glyphicon-info-sign"></a></li>
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

	<hr/>
	<footer class="footer">
		<div class="container text-muted">
			<div class="row">
				<div class="col-md-4 text-left">
					<h3>Contact</h3>
					<hr/>
					<ul class="list-unstyled">
						<li><strong>Petr Bělohlávek</strong></li>
						<li><a href="mailto:omp4j [at] petrbel.cz" target="_blank">omp4j [at] petrbel.cz</a> </li>
						<li><a href="http://www.petrbel.cz" target="_blank">www.petrbel.cz</a></li>
						<li><a href="https://github.com/omp4j/omp4j/issues" target="_blank">Issue tracker</a></li>

					</ul>
				</div>
				<div class="col-md-4 text-center">
					<h3>Copyright</h3>
					<hr/>
					&copy; Petr Bělohlávek, 2015
				</div>
				<div class="col-md-4 text-right">
					<h3>Navigation</h3>
					<hr/>
					<ul class="list-unstyled">
						<li><a href="home">Home <span class="glyphicon glyphicon-home"></a></li>
						<li><a href="download">Download <span class="glyphicon glyphicon-cloud-download"></a></li>
						<li><a href="tutorial">Tutorial <span class="glyphicon glyphicon-book"></a></li>
						<li><a href="api">API doc <span class="glyphicon glyphicon-info-sign"></a></li>
						<li><a href="authors">Authors <span class="glyphicon glyphicon-user"></a></li>
						<li><a href="https://github.com/omp4j/omp4j" target="_blank">Source <span class="glyphicon glyphicon-cloud"></a></li>
						<li><a href="demo">Demo <span class="glyphicon glyphicon-cloud-upload"></span></a></li>

					</ul>
				</div>
		</div>
	</footer>

	<script src=""""),_display_(/*83.16*/routes/*83.22*/.Assets.at("third/jquery/jquery-1.10.2.min.js")),format.raw/*83.69*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*84.16*/routes/*84.22*/.Assets.at("third/bootstrap/js/bootstrap.min.js")),format.raw/*84.71*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*85.16*/routes/*85.22*/.Assets.at("third/angularjs/angular.min.js")),format.raw/*85.66*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*86.16*/routes/*86.22*/.Assets.at("third/angularjs/angular-resource.min.js")),format.raw/*86.75*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*87.16*/routes/*87.22*/.Assets.at("javascripts/main.js")),format.raw/*87.55*/("""" type="text/javascript"></script>
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
                  DATE: Thu Apr 30 08:59:04 CEST 2015
                  SOURCE: /tmp/www/app/views/index.scala.html
                  HASH: ec736381fe77a9325a8b3ee352ae243a5c918543
                  MATRIX: 580->0|775->169|789->175|861->226|936->275|950->281|1028->338|1103->387|1117->393|1171->427|1251->481|1265->487|1317->519|4240->3415|4255->3421|4323->3468|4400->3518|4415->3524|4485->3573|4562->3623|4577->3629|4642->3673|4719->3723|4734->3729|4808->3782|4885->3832|4900->3838|4954->3871
                  LINES: 22->1|27->6|27->6|27->6|28->7|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|104->83|104->83|104->83|105->84|105->84|105->84|106->85|106->85|106->85|107->86|107->86|107->86|108->87|108->87|108->87
                  -- GENERATED --
              */
          