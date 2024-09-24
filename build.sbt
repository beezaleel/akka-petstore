ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
    .settings(
        name := "akka-petstore",
        idePackagePrefix := Some("com.softxpliot")
    )

resolvers += "Akka library repository".at("https://repo.akka.io/maven")

val akkaVersion = "2.8.6"
val akkaHttpVersion = "10.5.3"

libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion
)

