package com.reactive.one.controller;

import com.reactive.one.model.Message;
import com.reactive.one.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author guillaumenostrenoff
 *         since 09/06/2017.
 */
@RestController
@RequestMapping(value = "/messages")
public class MessageController {

  private final MessageService messageService;

  /**
   * Constructor.
   * @param messageService the message service
   */
  public MessageController(MessageService messageService) {
    this.messageService = messageService;
  }

  /**
   * Gets a message by id.
   *
   * @param id the id
   * @return the messages
   */
  @GetMapping("/{id}")
  public Mono<Message> get(@PathVariable("id") String id) {
    return messageService.get(id);
  }

  /**
   * Gets all messages.
   * @return all messages
   */
  @GetMapping
  public Flux<Message> getAll() {
    return messageService.getAll();
  }

}
