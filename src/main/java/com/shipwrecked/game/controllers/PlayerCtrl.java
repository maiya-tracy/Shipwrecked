package com.shipwrecked.game.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shipwrecked.game.models.Player;
import com.shipwrecked.game.services.PlayerService;

@Controller
public class PlayerCtrl {
	@Autowired
	PlayerService playerService;
	
	@GetMapping("/newPlayer")
	public String newPlayer(Model model, @ModelAttribute("newPlayer") Player player) {
		return "player/newPlayer.jsp";
	}

	@PostMapping("/newPlayer/process")
	public String createPlayer(@Valid @ModelAttribute("newPlayer") Player player, BindingResult results, HttpSession session){
		if(results.hasErrors()) {
			return"player/newPlayer.jsp";
		}
		Player p = playerService.createPlayer(player);
		session.setAttribute("player", p);
		return"redirect:/createGamePage";
	}
}
