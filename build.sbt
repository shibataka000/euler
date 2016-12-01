lazy val root = (project in file(".")).
  settings(
    name := "euler",
    version := "1.0",
    scalaVersion := "2.12.0"
  )

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8.6" % "test")

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")
