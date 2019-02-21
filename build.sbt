lazy val fulid = project.in(file("."))
    .settings(
      name := "fulid",
      version := "0.1",
      scalaVersion := "2.12.8",
      crossScalaVersions := Seq(scalaVersion.value, "2.11.12"),
      scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
      libraryDependencies ++= Seq(
        "net.petitviolet" %% "ulid4s" % "0.3.0",
        "org.typelevel" %% "cats-effect" % "1.2.0",
        "org.scalacheck" %% "scalacheck" % "1.14.0" % "test",
        "org.scalatest" %% "scalatest" % "3.0.6-SNAP6" % "test"
      ),
    )





