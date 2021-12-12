package com.graphql.java.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Table(value = "friends")
public class Friend{
	
	@JsonProperty("name")
	private String name;
	
	@Id
	@JsonProperty("number")
	private Integer number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Friend(String name, Integer number) {
		super();
		this.name = name;
		this.number = number;
	}
	public Friend() {
	}
	
	
	
}
