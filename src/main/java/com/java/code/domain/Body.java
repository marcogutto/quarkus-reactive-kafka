package com.java.code.domain;

import io.quarkus.mongodb.panache.reactive.ReactivePanacheMongoEntityBase;


public class Body extends ReactivePanacheMongoEntityBase{
	
	public String text;
	public String thumb;
	public String mimetype;
	public String url;
	public String media;

}