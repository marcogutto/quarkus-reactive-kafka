package java.com.kafka.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class Message {
	
	public String dtm;
	public String uid;
	public String cuid;
	public String dir;
	public String type;
	public Body body;

}