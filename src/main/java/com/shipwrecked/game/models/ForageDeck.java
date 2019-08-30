package com.shipwrecked.game.models;

import java.util.ArrayList;
import java.util.Collections;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "foragedecks")
public class ForageDeck {

	private ArrayList<Forage> deck;

	public ForageDeck(ArrayList<Forage> deck) {
		this.deck = deck;
		this.shuffle();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="game_id")
	private Game game;
	
	
	public ArrayList<Forage> getDeck() {
		return deck;
	}

	public void shuffle() {
		Collections.shuffle(this.deck);
	}

	public Forage deal() {
		return deck.remove(0);
		
		
		
	}
}
