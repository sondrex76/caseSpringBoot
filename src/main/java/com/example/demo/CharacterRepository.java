package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<CharacterObject, Long> {
	// List<CharacterObject> findByFirstName(String characterId);
	List<CharacterObject> findAll();
}
