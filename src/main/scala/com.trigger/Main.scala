package com.trigger

import spark.Spark._
import spark._

class HelloWorld extends App {

  get(new Route("/hello") {
    override def handle(Request request, Response response) = "Hello World!"
  });

}

