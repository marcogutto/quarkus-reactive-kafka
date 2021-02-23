package java.com.kafka;

import java.com.kafka.domain.Event;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/events")
public class EventResource {
	
	@Inject
	@Channel("newEvent")
	Emitter<Event> eventEmitter;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(Event newEvent) {
        eventEmitter.send(newEvent);
    }
}