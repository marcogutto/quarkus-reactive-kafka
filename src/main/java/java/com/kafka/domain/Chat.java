package java.com.kafka.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class Chat {
	
	public String uid;
	public String name;
	public String contactUid;
	public String dtm;

}