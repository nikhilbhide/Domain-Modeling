package com.org.music;

import java.util.List;

public class Album {
	public Album(List<Volume> volumes) {
		this.volumes= volumes;
	}
	/**
	 * @return the volume
	 */
	public List<Volume> getVolume() {
		return volumes;
	}
	/**
	 * @param volume the volume to set
	 */
	public void setVolume(List<Volume> volume) {
		this.volumes = volume;
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
	private List<Volume> volumes;
	private String name;
	
	
	
	
}
