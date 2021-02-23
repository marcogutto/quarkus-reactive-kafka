package java.com.kafka.resource;

import java.com.kafka.domain.Event;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/events")
public class EventResource {
	
//	@Inject
//	@Channel("newEvent")
//	Emitter<Event> eventEmitter;

    @POST
    public void send(Event newEvent) {
//        eventEmitter.send(newEvent);
    }
}