import sbt._

object Dependencies {

  object V {
    val macroParadise = "2.0.1"

    val datomic       = "0.9.5530"

    val specs2        = "3.8.6-scalaz-7.1"
    val scalaTest     = "3.0.1"
  }

  object Compile {
    val datomic = "com.datomic"    %    "datomic-free"    %    V.datomic    %    "provided" exclude("org.slf4j", "slf4j-nop")
  }

  object Test {
    val specs2 = "org.specs2"    %%    "specs2-core"    %    V.specs2   %    "test"
  }

  object IntegrationTest {
    val scalaTest = "org.scalatest" %% "scalatest" % V.scalaTest % "it"
  }

}
