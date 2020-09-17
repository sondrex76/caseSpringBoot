package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CharacterRepository extends JpaRepository<Character, Long> {
	// List<CharacterObject> findByFirstName(String characterId);
	List<Character> findAll();
}
