package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class CharacterCreationDto {
	private List<Character> characters = new ArrayList<>();
	
    public void addCharacter(Character character) {
        this.characters.add(character);
    }
    
    public List<Character> getCharacters() {
    	return this.characters;
    }
}
