package com.shipwrecked.game.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	@GetMapping("/getShipwrecked/{game_id}")
	public String lobby(@PathVariable("game_id") Long game_id) {
		return "game/lobby.jsp";
	}
	@GetMapping("/getShipwrecked/{game_id}/go")
	public String inGame(@PathVariable("game_id") Long game_id) {
		return "game/inGame.jsp";
	}
}
