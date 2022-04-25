package br.com.erudio;

import lombok.Getter;
import lombok.Setter;

public class Greeting {

	@Getter


	private final long id;
	
	private final String content;

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	
}
