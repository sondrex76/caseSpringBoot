package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// Types are likely wrong compared to the database, needs to be fixed
@Entity
@Table(name = "employee")
public class Character implements Serializable {
	public Character(long characterId, String characterName, long characterExperienceValue, String characterDetails, String characterPicture) {
		this.id = characterId;
		this.name = characterName;
		this.experience= characterExperienceValue;
		this.details = characterDetails;
		this.picture = characterPicture;		
	}
	public Character() {}
	
	private static final long serialVersionUID = -100L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @Column(name = "characterId")
	private long id;

	// @Column(name = "characterName")
	private String name;

	// @Column(name = "characterExperienceValue")
	private long experience;

	// @Column(name = "characterDetails")
	private String details;

	// @Column(name = "characterPicture")
	private String picture;

	//Setters, getters and constructors
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public long getExperience() {
		return experience;
	}
	
	public String getDetails() {
		return details;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setId(long characterId) {
		this.id = characterId;
	}
	
	public void setName(String characterName) {
		this.name = characterName;
	}
	
	public void setExperience(long characterExperienceValue) {
		this.experience= characterExperienceValue ;
	}
	
	public void setDetails(String characterDetails) {
		this.details = characterDetails;
	}
	
	public void setPicture(String characterPicture) {
		this.picture = characterPicture;
	}
}
