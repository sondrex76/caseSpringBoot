package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class CharactersController {
	@Autowired
	public CharacterRepository repository;
	
	@GetMapping("/characters")
	public String characters(Model model) {
		// TODO: Make characters.html display character objects clickable and lead to openCharacter.html
		// TODO: Allow image to be shown when character is open
		
		
		model.addAttribute("characterList", repository.findAll());
		
		return "characters";
	}

	@Controller
	public class OpenCharacterController {
		@RequestMapping("/characters/{id}")
		public String openCharacter(@PathVariable("id") long id, Model model) {
		    model.addAttribute("character", repository.getOne(id));
		    
		    return "openCharacter";
		}
	}
	
	@Controller
	public class CharacterFormController {
		@GetMapping("/characters/new")
		public String characters(Model model) {
			model.addAttribute("character", new Character());
			
			return "newCharacterForm";
		}

		@PostMapping(value = "/characters/new")
		public String saveCharacters(@ModelAttribute Character characterObject, Model model) {
			repository.save(characterObject);

		    model.addAttribute("characterList", repository.findAll());
		    
		    return "redirect:/characters";
		}
	}
}