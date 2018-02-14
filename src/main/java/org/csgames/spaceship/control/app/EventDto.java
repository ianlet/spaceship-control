package org.csgames.spaceship.control.app;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class EventDto {

  public final String type;
  public final String source;
  public final String payload;

  public EventDto(String type, String source, String payload) {
    this.type = type;
    this.source = source;
    this.payload = payload;
  }
}
