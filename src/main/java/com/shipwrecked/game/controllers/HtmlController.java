package com.shipwrecked.game.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class HtmlController {
	
	@GetMapping("/")
	public String landingPage() {
		return "/index.html";
	}
	

}
