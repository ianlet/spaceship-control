package org.csgames.spaceship.control.ui.rest;

import com.google.gson.Gson;
import org.csgames.spaceship.control.app.EventDto;
import org.csgames.spaceship.control.app.EventAppService;
import spark.Request;
import spark.Response;
import spark.Route;

public class EventHandler implements Route {

  private final Gson gson;
  private final EventAppService eventAppService;

  public EventHandler(Gson gson, EventAppService eventAppService) {
    this.gson = gson;
    this.eventAppService = eventAppService;
  }

  @Override
  public Object handle(Request request, Response response) throws Exception {
    EventDto receivedEvent = parseReceivedEvent(request);
    eventAppService.handleReceivedEvent(receivedEvent);
    return noResponse();
  }

  private EventDto parseReceivedEvent(Request request) {
    String eventBody = request.body();
    return gson.fromJson(eventBody, EventDto.class);
  }

  private Object noResponse() {
    return gson.toJson(new Object());
  }
}
