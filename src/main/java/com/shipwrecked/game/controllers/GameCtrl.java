package com.shipwrecked.game.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shipwrecked.game.models.Game;
import com.shipwrecked.game.models.User;
import com.shipwrecked.game.services.GameService;
import com.shipwrecked.game.services.UserService;


@Controller
public class GameCtrl {
	
	@Autowired
	GameService gameService;
	@Autowired
	UserService playerService;
	
	@GetMapping("/getShipwrecked")
	public String createOrJoinPage() {
	
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
		return "redirect:/getShipwrecked/"+ g.getId()+"/process";
	}
	
	@PostMapping("/getShipwrecked/{id}/process")
	public String addPlayer(Model model, @PathVariable("id") Long game_id, HttpSession session) {
		Game oneGame = gameService.findById(game_id);
		User player = (User) session.getAttribute("player");
		
		player.setGame(oneGame);
		
		return "redirect:/getShipwrecked/{game_id}";
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