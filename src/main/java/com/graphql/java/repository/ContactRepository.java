package com.graphql.java.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.graphql.java.entity.Friend;

import reactor.core.publisher.Flux;

@Repository
public interface ContactRepository extends ReactiveCrudRepository<Friend, Integer> {
	
	Flux<Friend> findByName(String name);
	
}


