package com.reactive.one.service.impl;

import com.reactive.one.dao.MessageDao;
import com.reactive.one.model.Message;
import com.reactive.one.service.MessageService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author guillaumenostrenoff
 *         since 09/06/2017.
 */
@Service
public class MessageServiceImpl implements MessageService {

  private final MessageDao messageDao;

  /**
   * Default constructor.
   *
   * @param messageDao default repository to autowire
   */
  public MessageServiceImpl(MessageDao messageDao) {
    this.messageDao = messageDao;
  }

  @Override
  public Mono<Message> get(String id) {
    return messageDao.findById(id);
  }

  @Override
  public Flux<Message> getAll() {
    return messageDao.findAll();
  }

  @Override
  public Mono<Void> create(Mono<Message> message) {
    return null;
  }
}
