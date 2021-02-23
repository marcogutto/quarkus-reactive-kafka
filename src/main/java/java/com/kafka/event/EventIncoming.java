package java.com.kafka.event;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.reactive.messaging.Incoming;

@ApplicationScoped
public class EventIncoming {

	@Incoming("newEvent")
	public void precoAdicionado(String event) {
		System.out.println("EventIncoming.send() " + event);
	}
}
