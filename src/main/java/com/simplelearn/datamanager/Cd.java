package com.simplelearn.datamanager;

import java.util.List;

public class Cd {
private String title;
private String artist;
private int year;
private int numberofTracks;
private int playingtime;
private List<Tracks> tracks;

public Cd(String title, String artist, int year, int numberofTracks, int playingtime, List<Tracks> tracks) {
	super();
	this.title = title;
	this.artist = artist;
	this.year = year;
	this.numberofTracks = numberofTracks;
	this.playingtime = playingtime;
	this.tracks = tracks;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getNumberofTracks() {
	return numberofTracks;
}
public void setNumberofTracks(int numberofTracks) {
	this.numberofTracks = numberofTracks;
}
public int getPlayingtime() {
	return playingtime;
}
public void setPlayingtime(int playingtime) {
	this.playingtime = playingtime;
}
public List<Tracks> getTracks() {
	return tracks;
}
public void setTracks(List<Tracks> tracks) {
	this.tracks = tracks;
}




}
