package com.org.music;

import java.util.List;

public class Volume {
	public Volume(List<Author> authors) {
		this.authors = authors;
	}
	private String name;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	private List<Author> authors;
	/**
	 * @return the author
	 */
	public List<Author> getAuthors() {
		return authors;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(List<Author> authors) {
		this.authors = authors;
	}
}