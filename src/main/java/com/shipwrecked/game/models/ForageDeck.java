package com.shipwrecked.game.models;

import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="forage_decks")
public class ForageDeck {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="deck", fetch = FetchType.LAZY)
	private List<Forage> cards;
	
	public ForageDeck() {}

	public ForageDeck(List<Forage> deck) {
		this.cards = deck;
	}


	public List<Forage> getDeck() {
		return cards;
	}

	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Forage deal() {
		return cards.remove(0);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDeck(List<Forage> deck) {
		this.cards = deck;
	}
	
	
	
		
}
