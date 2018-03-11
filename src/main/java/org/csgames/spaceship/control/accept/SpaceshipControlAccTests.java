package org.csgames.spaceship.control.accept;

import org.csgames.spaceship.control.ui.rest.SpaceshipControlRestApi;
import org.csgames.spaceship.sdk.SpaceshipSdk;
import org.csgames.spaceship.sdk.accept.AcceptanceService;

public class SpaceshipControlAccTests {

  public static void main(String[] argv) {
    SpaceshipSdk sdk = SpaceshipSdk.register(System.getProperty("teamToken"));

    SpaceshipControlRestApi api = new SpaceshipControlRestApi(sdk);
    api.start();
    api.awaitInitialization();
    int apiPort = api.getPort();

    AcceptanceService acceptanceService = sdk.createAcceptanceService(apiPort);
    acceptanceService.acceptUserStories();

    api.stop();
  }
}
