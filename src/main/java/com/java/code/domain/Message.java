package com.java.code.domain;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntityBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class Message extends ReactivePanacheMongoEntityBase{
	
	public String dtm;
	public String uid;
	public String cuid;
	public String dir;
	public String type;
	public Body body;

}