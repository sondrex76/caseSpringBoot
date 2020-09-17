package com.example.demo;

import java.util.List;

public class CharacterCreationDto {
	private List<CharacterObject> characters;
	
    public void addCharacter(CharacterObject character) {
        this.characters.add(character);
    }
    
    public List<CharacterObject> getCharacters() {
    	return characters;
    }
}
