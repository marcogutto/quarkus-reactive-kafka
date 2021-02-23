package java.com.kafka.resource;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@Path("/events")
public class EventResource {
	
	@Inject
	@Channel("newEvent")
	Emitter<String> eventEmitter;

    @POST
    public void send(String newEvent) {
        eventEmitter.send(newEvent);
    }
}