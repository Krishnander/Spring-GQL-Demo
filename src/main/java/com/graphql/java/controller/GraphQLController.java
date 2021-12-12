package com.graphql.java.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.java.entity.Friend;
import com.graphql.java.repository.ContactRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class GraphQLController {

	private ContactRepository contactrepo;
	
	public GraphQLController(ContactRepository ContactRepository) {
		this.contactrepo = ContactRepository;
	}
	
	@QueryMapping
	Flux<Friend> getFriends() {
		return this.contactrepo.findAll();
	}
	
	@QueryMapping
	Flux<Friend> getFriendByName(@Argument String name){
		return this.contactrepo.findByName(name);
	}
	
	@MutationMapping
	Mono<Friend> addFriend(@Argument String name){
		var friend = new Friend();
		friend.setNumber(87548);
		friend.setName(name);
	    return this.contactrepo.save(friend);
	}

}
