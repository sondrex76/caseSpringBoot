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
public class CharacterObject implements Serializable {
	private static final long serialVersionUID = -100L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "characterName")
	private long characterId;

	@Column(name = "characterName")
	private String characterName;

	@Column(name = "characterExperienceValue")
	private long characterExperienceValue;

	@Column(name = "characterDetails")
	private String characterDetails;

	@Column(name = "characterPicture")
	private String characterPicture;

	//Setters, getters and constructors
}
