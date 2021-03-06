package com.java.code.domain;

import java.util.List;

import org.bson.codecs.pojo.annotations.BsonId;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntityBase;
import io.smallrye.mutiny.Uni;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class Contact extends ReactivePanacheMongoEntityBase {
	
	@BsonId
	public ContactId id;
	
	public String uid;
	public String name;
	public String type;
	public String dtm;

}