package com.org.music;

import java.util.List;

public class Volume {
	public Volume(List<Artist> artists) {
		this.artists = artists;
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
	private List<Artist> artists;
	/**
	 * @return the author
	 */
	public List<Artist> getArtists() {
		return artists;
	}
	/**
	 * @param author the author to set
	 */
	public void setArtist(List<Artist> artists) {
		this.artists = artists;
	}
}