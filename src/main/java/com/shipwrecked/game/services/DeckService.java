package com.shipwrecked.game.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shipwrecked.game.models.Forage;
import com.shipwrecked.game.models.ForageDeck;
import com.shipwrecked.game.models.Madness;
import com.shipwrecked.game.models.MadnessDeck;
import com.shipwrecked.game.models.Night;
import com.shipwrecked.game.models.NightDeck;
import com.shipwrecked.game.repositories.ForageDeckRepository;
import com.shipwrecked.game.repositories.ForageRepository;
import com.shipwrecked.game.repositories.MadnessDeckRepository;
import com.shipwrecked.game.repositories.MadnessRepository;
import com.shipwrecked.game.repositories.NightDeckRepository;
import com.shipwrecked.game.repositories.NightRepository;

@Service
public class DeckService {
	@Autowired
	private NightRepository nightRepo;
	@Autowired
	private NightDeckRepository NDRepo;
	@Autowired
	private ForageRepository forageRepo;
	@Autowired
	private ForageDeckRepository FDRepo;
	@Autowired
	private MadnessRepository madnessRepo;
	@Autowired
	private MadnessDeckRepository MDRepo;
	
	// NIGHT DECK FUNCTIONS
	public NightDeck createNightDeck(NightDeck nightDeck) {
		return NDRepo.save(nightDeck);
	}
	
	public NightDeck getNightDeck(Long id) {
		Optional<NightDeck> optNightDeck = NDRepo.findById(id);
		if(optNightDeck.isPresent()) {
			return optNightDeck.get();
		}else {
			return null;
		}
	}
	public Night createNightCard(Night card) {
		return nightRepo.save(card);
	}

	
	// FORAGE DECK FUNCTIONS
	public Forage createForageCard(Forage card) {
		return forageRepo.save(card);
	}
	
	public ForageDeck createForageDeck(ForageDeck forageDeck) {
		return FDRepo.save(forageDeck);
		
	}

	public ForageDeck getForageDeck(Long id) {
		Optional<ForageDeck> opt = FDRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			return null;
		}
		
	}
	
	// MADNESS DECK FUNCTIONS
	public Madness createMadnessCard(Madness card) {
		return madnessRepo.save(card);
	}
	
	public MadnessDeck createMadnessDeck(MadnessDeck madnessDeck) {
		return MDRepo.save(madnessDeck);
	}
	public MadnessDeck getMadnessDeck(Long id) {
		Optional<MadnessDeck> opt = MDRepo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			return null;
		}
		
	}
	
	
}
