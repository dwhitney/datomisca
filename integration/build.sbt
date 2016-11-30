
Defaults.itSettings

name := "datomisca-tests"

libraryDependencies += Dependencies.Compile.datomic

libraryDependencies += Dependencies.IntegrationTest.scalaTest

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.5"

fork in IntegrationTest := true

publishArtifact := false
