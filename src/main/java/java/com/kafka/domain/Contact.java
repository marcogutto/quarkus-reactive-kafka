package java.com.kafka.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class Contact {
	
	public String uid;
	public String name;
	public String type;
	public String dtm;

}