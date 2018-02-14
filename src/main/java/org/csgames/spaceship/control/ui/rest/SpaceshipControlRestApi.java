package org.csgames.spaceship.control.ui.rest;

import com.google.gson.Gson;

import org.csgames.spaceship.control.app.EventAppService;

import static spark.Spark.post;

public class SpaceshipControlRestApi {

  public static void main(String[] args) {
    Gson gson = new Gson();

    EventAppService eventAppService = new EventAppService();
    EventHandler eventHandler = new EventHandler(gson, eventAppService);

    post("/events", eventHandler);
  }
}
