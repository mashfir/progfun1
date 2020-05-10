course := "progfun1"
assignment := "example"
scalaVersion := Option(System.getProperty("scala.version")).getOrElse("2.11.4")
scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")
