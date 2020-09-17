package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CharacterCreationDto {
	private List<CharacterObject> characters = new ArrayList<>();
	
    public void addCharacter(CharacterObject character) {
        this.characters.add(character);
    }
    
    public List<CharacterObject> getCharacters() {
    	return this.characters;
    }
}
