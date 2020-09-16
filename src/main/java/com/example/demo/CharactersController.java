package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CharactersController {
	@GetMapping("/characters")
	public String characters(Model model) {
		// TODO: Extract data from database
		// TODO: Send data to characters.html
		
		
		
		
		return "characters";
	}
}
