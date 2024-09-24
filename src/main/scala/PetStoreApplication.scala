package com.softxpliot

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.Directives._

object PetStoreApplication {
  def main(args: Array[String]): Unit = {
    implicit val actorSystem = ActorSystem(Behaviors.empty, "petstore")
    val route = get {
      path("hello") {
        complete(HttpEntity(ContentTypes.`text/plain(UTF-8)`, "Hello"))
      }
    }

    Http().newServerAt("127.0.0.1", 8080).bind(route)
  }
}
