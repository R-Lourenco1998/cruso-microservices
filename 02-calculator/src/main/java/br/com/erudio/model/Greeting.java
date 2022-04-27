package br.com.erudio.model;

import lombok.Getter;

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
