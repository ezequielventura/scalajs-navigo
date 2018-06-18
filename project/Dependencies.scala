import sbt._

// *****************************************************************************
// Library dependencies
// *****************************************************************************

object library {
  object Version {
    val scalaCheck = "1.13.5"
    val utest      = "0.6.4"
    val npmNavigoVersion = "7.1.2"
  }

  val scalaCheck = "org.scalacheck" %% "scalacheck" % Version.scalaCheck
  val utest      = "com.lihaoyi"    %% "utest"      % Version.utest
}

