package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class CharactersController {
	@Autowired
	CharacterRepository repository;
	
	@GetMapping("/characters")
	public String characters(Model model) {
		// TODO: Extract data from database
		// TODO: Send data to characters.html as an array
		
		// TODO: Make characters.html display all objects in array
		// TODO: Make characters.html display character objects clickable and lead to openCharacter.html
		// TODO: Make button leading to template form for adding new object to database
		// TODO: Allow image to be shown when character is open
		
		
		model.addAttribute("characterList", repository.findAll());
		
		return "characters";
	}
}
