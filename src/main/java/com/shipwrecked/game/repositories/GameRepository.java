package com.shipwrecked.game.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shipwrecked.game.models.Game;

@Repository
public interface GameRepository extends CrudRepository<Game, Long>{

	Optional<Game> findByLobbyName(String game_name);
	
}
