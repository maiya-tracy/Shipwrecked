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
@Table(name="night_decks")
public class NightDeck {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="deck", fetch = FetchType.LAZY)
	private List<Night> cards;
	
	public NightDeck() {
		
	}
	
	

	public NightDeck(List<Night> cards) {

		this.cards = cards;
	}



	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public List<Night> getDeck() {
		return cards;
	}
	
	public Night deal() {
		return cards.remove(0);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDeck(List<Night> deck) {
		this.cards = deck;
	}
	
	
}
