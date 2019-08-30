package com.shipwrecked.game.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipwrecked.game.models.User;
import com.shipwrecked.game.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository playerRepository;
	
	public User createPlayer(User player) {
		// TODO Auto-generated method stub
		player.setHealth(player.starting_health());
		return playerRepository.save(player);
	}
	public User findById(Long id) {
		Optional<User> optionalPlayer = playerRepository.findById(id);
		if (optionalPlayer.isPresent()) {
			return optionalPlayer.get();
		} else {
			return null;
		}
	}
}
