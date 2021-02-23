package java.com.kafka.event;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EventOutgoing {

//	@Outgoing("newEvent")
//	public Multi<Event> generate() {
//		
//		return Multi.createFrom().ticks().every(Duration.ofSeconds(5))
//				.onOverflow().drop()
//				.map(tick -> {
//					
//					Event event = new Event();
//					event.setAck("-1");
//					event.setChatName("Marco");
//					Contact contact = new Contact();
//					contact.setDtm("1614100361");
//					contact.setName("Fulano");
//					contact.setType("type");
//					contact.setUid("552199999999");
//					event.setContact(contact);
//					event.setEvent("message");
//					Message message = new Message();
//					Body body = new Body();
//					body.setMedia("media");
//					body.setMimetype("png");
//					body.setThumb("thumb");
//					body.setUrl("url");
//					message.setBody(body);
//					message.setCuid("3219931292318");
//					message.setDir("");
//					message.setType("type");
//					message.setUid("552199999999");
//					event.setMessage(message);
//					return event;
//					
//				});
//	}

}