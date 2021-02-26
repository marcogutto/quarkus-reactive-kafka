package com.java.code.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)

public class ContactId {

	public String uid;
	public String eventUid;
	
}
