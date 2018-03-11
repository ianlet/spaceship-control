package org.csgames.spaceship.control.app;

import org.csgames.spaceship.sdk.SpaceshipSdk;
import org.csgames.spaceship.sdk.SpaceshipService;

public class EventAppService {

  private final SpaceshipService spaceshipService;

  public EventAppService(SpaceshipSdk sdk) {
    this.spaceshipService = sdk.getSpaceshipService();
  }

  public void handleReceivedEvent(EventDto eventDto) {
    // FIXME: Implement core logic to handle received events
  }
}
