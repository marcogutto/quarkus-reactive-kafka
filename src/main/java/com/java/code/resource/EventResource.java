package com.java.code;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.code.domain.Event;

import io.smallrye.reactive.messaging.annotations.Channel;
import io.smallrye.reactive.messaging.annotations.Emitter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.smallrye.mutiny.Uni;

@Path("/events")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EventResource {

    @Inject
	@Channel("events-out")
    private Emitter<String> emitter;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(EventResource.class);

    @POST
    public Event save(Event event) {

        ObjectMapper mapper = new ObjectMapper();

        String eventOut = "";

        try {
            eventOut = mapper.writeValueAsString(event);
            LOGGER.info(eventOut);
            emitter.send(eventOut);
            
		} catch (JsonProcessingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        return event;
    }
}