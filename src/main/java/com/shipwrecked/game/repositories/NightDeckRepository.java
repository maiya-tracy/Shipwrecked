package com.shipwrecked.game.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shipwrecked.game.models.NightDeck;

@Repository
public interface NightDeckRepository extends CrudRepository<NightDeck, Long> {
	
}
