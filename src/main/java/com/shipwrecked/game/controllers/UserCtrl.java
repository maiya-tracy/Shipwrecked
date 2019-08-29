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

import com.shipwrecked.game.models.User;
import com.shipwrecked.game.services.UserService;

@Controller
public class UserCtrl {
	@Autowired
	UserService playerService;
	
	@GetMapping("/newPlayer")
	public String newPlayer(Model model, @ModelAttribute("newPlayer") User player) {
		return "player/newPlayer.jsp";
	}

	@PostMapping("/newPlayer/process")
	public String createPlayer(@Valid @ModelAttribute("newPlayer") User player, BindingResult results, HttpSession session){
		if(results.hasErrors()) {
			return"player/newPlayer.jsp";
		}
		User p = playerService.createPlayer(player);
		session.setAttribute("player", p);
		return"redirect:/getShipwrecked";
	}
}
