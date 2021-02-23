package java.com.kafka.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class Event {
	
	public String event;
	public String token;
	public String uid;
	public String chatName;
	public Contact contact;
	public Message message;
	public String ack;

}
