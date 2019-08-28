package com.shipwrecked.game.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shipwrecked.game.models.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>{
	
	List<Player> findAll();
	
	void deleteById(Long id);
}
