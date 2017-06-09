package com.reactive.one;

import com.reactive.one.dao.MessageDao;
import com.reactive.one.model.Message;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

/**
 * @author guillaumenostrenoff
 *         since 09/06/2017.
 */
@Configuration
public class MongoDBInitializer {

  @Bean
  ApplicationRunner databaseInitialization(MessageDao messageDao) {
    return a -> messageDao.count()
        .flatMap(n -> n == 0 ? messageDao.save(Message.builder()
            .id("first")
            .message("That's the first one my friend")
            .build()) : Mono.empty())
        .block();
  }



}
