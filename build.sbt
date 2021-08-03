// About
name := "fulid"
version := "0.1"
description := ""
organization := ""
homepage := Some(url("https://github.com/sh0hei/fulid"))
licenses := Seq("MIT" -> new java.net.URL("http://opensource.org/licenses/MIT"))
developers := List(Developer("sh0hei", "Shohei Shimomura", "", url("https://github.com/sh0hei")))
scmInfo := Some(
  ScmInfo(
    browseUrl = url("https://github.com/sh0hei/fulid.git"),
    connection = "scm:git:git@github.com:sh0hei/fulid.git"
  ))

// Build
ThisBuild / crossScalaVersions := Seq("2.13.6")
ThisBuild / scalaVersion := crossScalaVersions.value.last

// Compile options
scalacOptions ++= Seq("-deprecation", "-feature", "-target:jvm-1.8")
javacOptions ++= Seq("-source", "8", "-target", "8")

// Dependencies
libraryDependencies ++= Seq(
  "org.wvlet.airframe" %% "airframe-ulid" % "21.7.0"
)

