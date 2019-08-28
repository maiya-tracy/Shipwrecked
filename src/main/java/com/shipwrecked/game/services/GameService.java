package com.shipwrecked.game.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipwrecked.game.models.Game;
import com.shipwrecked.game.repository.GameRepository;

@Service
public class GameService {
	@Autowired
	GameRepository gameRepository;
	
	public Game createGame(Game game) {
		// TODO Auto-generated method stub
		return gameRepository.save(game);
	}

}
