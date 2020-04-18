name := "scaladores-types-are-your-friends"

version := "0.1"

scalaVersion := "2.12.8"
libraryDependencies ++= Seq(
  "eu.timepit" %% "refined"                 % "0.9.10",
  "io.estatico" %% "newtype" % "0.4.3")

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)
