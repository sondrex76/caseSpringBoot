package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class CharacterController {
	@Controller
	public class CharactersController {
		@GetMapping("/characters/{id}")
		public String characters(Model model) {
			return "openCharacter";
		}
	}

}
