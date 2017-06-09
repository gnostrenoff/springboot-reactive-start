package com.reactive.one.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author guillaumenostrenoff
 *         since 09/06/2017.
 */
@Document
public class Message {

  @Id
  private String id;

  private String message;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMessage() {
    return message;
  }

  public static Builder builder() {
    return new Builder();
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public static class Builder {

    private final Message message;

    private Builder() {
      message = new Message();
    }

    public Builder id(String id) {
      message.setId(id);
      return this;
    }

    public Builder message(String message) {
      this.message.setMessage(message);
      return this;
    }

    public Message build() {
      return message;
    }

  }
}
