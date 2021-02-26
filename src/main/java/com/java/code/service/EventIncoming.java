package com.java.code.service;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class EventIncoming {

	@Incoming("events-in")
	public void eventIncoming(String event) {
		System.out.println("EventIncoming.eventIncoming() " + event);
    }
}