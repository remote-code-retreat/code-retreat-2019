name := "scala"

version := "0.1"

scalaVersion := "2.13.1"

val monocleVersion = "2.0.0"
val catsVersion = "2.0.0"
val refinedVersion = "0.9.10"

libraryDependencies += "org.typelevel" %% "cats-core" % catsVersion
libraryDependencies += "org.typelevel" %% "cats-effect" % catsVersion
libraryDependencies += "com.github.julien-truffaut" %%  "monocle-core"  % monocleVersion
libraryDependencies += "com.github.julien-truffaut" %%  "monocle-macro" % monocleVersion
libraryDependencies += "eu.timepit" %% "refined" % refinedVersion

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.1" % Test
libraryDependencies += "eu.timepit" %% "refined-scalacheck" % refinedVersion % Test
