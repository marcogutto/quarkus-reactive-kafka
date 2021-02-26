package com.java.code.domain;

import java.util.List;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntity;
import io.smallrye.mutiny.Multi;
import io.smallrye.mutiny.Uni;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class Event extends ReactivePanacheMongoEntity {
	
	public String event;
	public String token;
	public String uid;
	public String chatName;
	public Contact contact;
	public Message message;
	public String ack;

}
