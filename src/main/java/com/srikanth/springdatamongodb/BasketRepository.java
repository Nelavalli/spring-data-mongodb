package com.srikanth.springdatamongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;

@Repository
public interface BasketRepository extends ReactiveMongoRepository<Basket, Long> {
    Flux<Basket> findAllByItemId(String value);
}
