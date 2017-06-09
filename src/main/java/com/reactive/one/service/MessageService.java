package com.reactive.one.service;

import com.reactive.one.model.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author guillaumenostrenoff
 *         since 09/06/2017.
 */
public interface MessageService {

  Mono<Message> get(String id);

  Flux<Message> getAll();

  Mono<Void> create(Mono<Message> message);

}
