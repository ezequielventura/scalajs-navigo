lazy val scalaJsNavigo = project.in(file(".")).
  enablePlugins(ScalaJSBundlerPlugin).
  settings(settings)

lazy val settings = 
  commonSettings ++
  jsSettings ++
  scalafmtSettings

lazy val commonSettings = 
  Seq(
    scalaVersion := "2.12.4",
    organization := "com.anubor",
    organizationName := "Ezequiel Ventura",
    name := "Scala.js facade for Navigo",
    normalizedName := "scalajs-navigo",
    crossScalaVersions := Seq("2.11.11", "2.12.4"),
    startYear := Some(2018),
    licenses += ("GNU LGPLv3", url("https://www.gnu.org/licenses/lgpl-3.0.en.html")),
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-language:_",
      "-target:jvm-1.8",
      "-encoding", "UTF-8",
      "-Ypartial-unification",
      "-Ywarn-unused-import"
    )
  )

lazy val jsSettings =
  Seq(
    jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(),
    scalaJSLinkerConfig ~= { _.withModuleKind(ModuleKind.CommonJSModule) },
    npmDependencies in Compile ++= Seq(
      "navigo" -> library.Version.npmNavigoVersion
    )
  )

lazy val scalafmtSettings =
  Seq(
    scalafmtOnCompile := true
  )
