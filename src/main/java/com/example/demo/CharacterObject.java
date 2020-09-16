package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


// Makes it crash, one of the variables may be of the wrong type

@Entity
@Table(name = "employee")
public class CharacterObject implements Serializable {
	private static final long serialVersionUID = -100L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "characterName")
	private long characterId;

	@Column(name = "characterName")
	private String characterName;

	@Column(name = "characterExperienceValue")
	private String characterExperienceValue;

	@Column(name = "characterDetails")
	private String characterDetails;

	@Column(name = "characterPicture")
	private String characterPicture;

	//Setters, getters and constructors
}
