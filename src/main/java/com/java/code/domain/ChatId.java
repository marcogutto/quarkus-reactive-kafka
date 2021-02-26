package com.java.code.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class ChatId {

	public String token;
	public String name;
	
}
