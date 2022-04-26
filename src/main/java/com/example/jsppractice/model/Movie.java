package com.example.jsppractice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	@GeneratedValue
	@Column(name="movieID")
	private Integer movieID;
	@Column(name="movieName")
	private String movieName;
	@Column(name="language")
	private String languages;
	@Column(name="duration")
	private Integer duration;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getIDnumber() {
		return movieID;
	}
	public void setIDnumber(Integer movieID) {
		this.movieID = movieID;
	}
	public String getMovie() {
		return movieName;
	}
	public void setMovie(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		languages = languages;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer Duration) {
		this.duration = duration;
	}
	

}
	
	