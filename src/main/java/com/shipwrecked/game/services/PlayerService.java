package com.shipwrecked.game.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipwrecked.game.models.Player;
import com.shipwrecked.game.repository.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	PlayerRepository playerRepository;
	
	public Player createPlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepository.save(player);
	}
	public Player findById(Long id) {
		Optional<Player> optionalPlayer = playerRepository.findById(id);
		if (optionalPlayer.isPresent()) {
			return optionalPlayer.get();
		} else {
			return null;
		}
	}
}
