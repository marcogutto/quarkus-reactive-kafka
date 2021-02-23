package java.com.kafka.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class Body {
	
	public String text;
	public String thumb;
	public String mimetype;
	public String url;
	public String media;

}