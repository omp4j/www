name := """www"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "org.antlr.v4" % "runtime" % "4.4" from "http://omp4j.petrbel.cz/antlr-runtime-4.4.jar"

unmanagedSourceDirectories in Compile += baseDirectory.value / "omp4j/src/main"

fork in run := true
