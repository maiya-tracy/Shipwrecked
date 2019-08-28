package com.shipwrecked.game.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shipwrecked.game.models.Game;
import com.shipwrecked.game.services.GameService;


@Controller
public class GameCtrl {
	@Autowired
	GameService gameService;
	@GetMapping("/")
	public String landingPage() {
		return "game/landingPage.jsp";
	}
	
	@GetMapping("/createGamePage")
	public String createOrJoinPage(@ModelAttribute("newGame") Game game) {
		return "game/createOrJoinPage.jsp";
	}
	
	@PostMapping("/createGame/process")
	public String createGame(@Valid @ModelAttribute("newGame") Game game, BindingResult results, HttpSession session) {
		if(results.hasErrors()) {
			return "game/createOrJoinPage.jsp";
		}
		Game g = gameService.createGame(game);
		session.setAttribute("gameId", g.getId());
		return "redirect:/createGamePage";
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