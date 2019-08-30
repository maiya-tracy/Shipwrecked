package com.shipwrecked.game.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shipwrecked.game.models.ForageDeck;
import com.shipwrecked.game.models.Game;
import com.shipwrecked.game.models.User;
import com.shipwrecked.game.services.DeckService;
import com.shipwrecked.game.services.GameService;
import com.shipwrecked.game.services.UserService;

@Controller
public class GameCtrl {

	@Autowired
	GameService gameService;
	@Autowired
	UserService playerService;
	@Autowired
	DeckService deckService;

	@GetMapping("/getShipwrecked")
	public String createOrJoinPage(@ModelAttribute("newGame") Game game) {
		return "game/createOrJoinPage.jsp";
	}
	
	@GetMapping("/getShipwrecked2")
	public static String test() {
		return "game/createOrJoinPage.jsp";
	}
	
	@GetMapping("/getShipwrecked3")
	public static void test2() {
		ThreadController myThread = new ThreadController();
		myThread.run();
	}
	
	@PostMapping("/getShipwrecked/process")
	public String createAndJoinGame(@ModelAttribute("newGame") Game game, BindingResult results, HttpSession session) {
		if (results.hasErrors()) {
			return "game/createOrJoinPage.jsp";
		} else {
			User current_user = (User) session.getAttribute("player");
			Game new_game = gameService.createGame(game);
			this.AddPlayerToGame(current_user.getId(), new_game.getId(), session);
			return "redirect:/getShipwrecked/" + new_game.getId();
		}
	}

	@PostMapping("/getShipwrecked/process/join")
	public String JoinGame(@RequestParam("lobbyJoinName") String lobbyJoinName, HttpSession session) {
		User current_user = (User) session.getAttribute("player");
		Game current_game = gameService.findByName(lobbyJoinName);
		System.out.println(current_game);
		if (current_game.getPlayers().size() >= 6) {
			return "redirect:/getShipwrecked/";
		} else {
			this.AddPlayerToGame(current_user.getId(), current_game.getId(), session);
			return "redirect:/getShipwrecked/" + current_game.getId();
		}
	}

	public void AddPlayerToGame(Long player_id, Long game_id, HttpSession session) {
		User player = playerService.findById(player_id);
		Game current_game = gameService.findById(game_id);
		player.setGame(current_game);
		playerService.createPlayer(player);
		session.setAttribute("current_game", current_game);
	}

	@GetMapping("/getShipwrecked/{game_id}")
	public String lobby(@PathVariable("game_id") Long game_id, Model model, HttpSession session) {
		Game current_game = gameService.findById(game_id);
		User current_user = (User) session.getAttribute("player");
		

		model.addAttribute("current_game", current_game);
		model.addAttribute("current_player", current_user);
		return "game/lobby.jsp";
	}

	@GetMapping("/getShipwrecked/{game_id}/go")
	public String inGame(@PathVariable("game_id") Long game_id, Model model, HttpSession session) {
		Game current_game = gameService.findById(game_id);
		User current_user = (User) session.getAttribute("player");
		model.addAttribute("current_game", current_game);
		model.addAttribute("current_player", current_user);
		return "game/inGame.jsp";
	}

	@GetMapping("/actionsTest")
	public String actionsTest() {
		return "game/testCardDraw.jsp";
	}

}