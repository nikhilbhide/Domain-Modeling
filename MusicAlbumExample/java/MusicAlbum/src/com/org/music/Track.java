package com.org.music;

import java.util.List;

public class Track {
 private String name;
 public Track(List<Song> songs) {
	 this.songs = songs;
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
/**
 * @return the songs
 */
public List<Song> getSongs() {
	return songs;
}
/**
 * @param songs the songs to set
 */
public void setSongs(List<Song> songs) {
	this.songs = songs;
}
private List<Song> songs;
}
