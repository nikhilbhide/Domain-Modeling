package com.org.music;

import java.util.List;

public class Author {
	public Author(List<Track> tracks) {
		this.tracks = tracks;
		this.name = name;
	}
	
	private String name;
	private List<Track> tracks;
	
	/**
	 * @return the tracks
	 */
	public List<Track> getTracks() {
		return tracks;
	}
	/**
	 * @param tracks the tracks to set
	 */
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
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
}