package java.com.kafka.event;

import java.com.kafka.domain.Event;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class EventIncoming {

	@Incoming("newEvent")
	public void precoAdicionado(Event event) {
		System.out.println("EventIncoming.send() " + event);
	}
}
