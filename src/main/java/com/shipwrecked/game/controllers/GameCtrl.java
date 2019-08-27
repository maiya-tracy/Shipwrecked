package com.shipwrecked.game.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameCtrl {
	@GetMapping("/")
	public String landingPage() {
		return "game/landingPage.jsp";
	}
	@GetMapping("/getShipwrecked")
	public String createOrJoinPage() {
		return "game/createOrJoinPage.jsp";
	}
}
