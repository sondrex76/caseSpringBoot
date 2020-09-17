package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class CharactersController {
	@Autowired
	public CharacterRepository repository;
	
	@GetMapping("/characters")
	public String characters(Model model) {
		// TODO: Fix form (make it not crash)
		// TODO: Make characters.html display character objects clickable and lead to openCharacter.html
		// TODO: Allow image to be shown when character is open
		
		
		model.addAttribute("characterList", repository.findAll());
		
		return "characters";
	}
	
	// Localized within the other controller because it needs access to repository and making it static is not an option
	@Controller
	public class CharacterFormController {
		@GetMapping("/characters/new")
		public String characters(Model model) {
			model.addAttribute("characterObject", new CharacterObject());
			
			return "newCharacterForm";
		}

		@PostMapping(value = "/characters/new")
		public String saveCharacters(@ModelAttribute CharacterObject characterObject, Model model) {
			System.out.println("Method 1");
			
			
			// CharacterObject newObject = new CharacterObject(characterObject[5], characterObject[8], characterObject[7], characterObject[6], characterObject[10]);
			
			// TEMP, for testing only
			// CharacterObject newObject = new CharacterObject(8, "name", 12, "Description", "Image link");
			
			// NOTE: characterObject has twice the number of values it should have which casues the issue, I do not know why
			
			repository.save(characterObject);
		 	
		    model.addAttribute("characterList", repository.findAll());
		    return "redirect:/characters";
		}
	}
}