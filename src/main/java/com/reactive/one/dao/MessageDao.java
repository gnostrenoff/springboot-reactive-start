package com.reactive.one.dao;

import com.reactive.one.model.Message;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

/**
 * @author guillaumenostrenoff
 *         since 09/06/2017.
 */
public interface MessageDao extends ReactiveCrudRepository<Message, String> {
}
