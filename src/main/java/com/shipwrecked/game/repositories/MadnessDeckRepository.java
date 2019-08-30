package com.shipwrecked.game.repositories;

import org.springframework.data.repository.CrudRepository;

import com.shipwrecked.game.models.MadnessDeck;

public interface MadnessDeckRepository extends CrudRepository<MadnessDeck, Long> {
	
}
