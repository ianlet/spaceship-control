package org.csgames.spaceship.control.ui.rest;

import com.google.gson.Gson;

import org.csgames.spaceship.control.app.EventAppService;
import org.csgames.spaceship.sdk.SpaceshipSdk;

import spark.Spark;

import static spark.Spark.post;

public class SpaceshipControlRestApi {

  private final SpaceshipSdk sdk;

  public SpaceshipControlRestApi(SpaceshipSdk sdk) {
    this.sdk = sdk;
  }

  public void start() {
    Gson gson = new Gson();

    EventAppService eventAppService = new EventAppService(sdk);
    EventHandler eventHandler = new EventHandler(gson, eventAppService);

    post("/events", eventHandler);
  }

  public void awaitInitialization() {
    Spark.awaitInitialization();
  }

  public void stop() {
    Spark.stop();
  }

  public int getPort() {
    return Spark.port();
  }

  public static void main(String[] args) {
    SpaceshipSdk sdk = SpaceshipSdk.register(System.getProperty("teamToken"));
    SpaceshipControlRestApi api = new SpaceshipControlRestApi(sdk);
    api.start();
  }
}
