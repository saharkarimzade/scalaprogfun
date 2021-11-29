name := "scalaprogfun"
version := "0.1.0"
scalaVersion := "3.0.2"
//Next line get warnings as error and limiting comile and run
//scalacOptions += "-Xfatal-warnings"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
//I wanna to see errors in a better view and better analysing so I added this line and create plugin.
// sbt but it gets error and when I search it in mvn repository I realized THERE ISN'T ANY CLIPPY LIBRARY(OR ARTIFACT) FOR SCALA 3
//scalacOptions += "-P:clippy:colors=true"