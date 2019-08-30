package com.shipwrecked.game.models;

import java.util.Collections;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="madness_decks")
public class MadnessDeck {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy="deck", fetch = FetchType.LAZY)
	private List<Madness> cards;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="game_id")
	private Game game;
	
	
	public MadnessDeck() {
		
	}
	

	public MadnessDeck(List<Madness> cards) {

		this.cards = cards;
	}


	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Madness> getCards() {
		return cards;
	}
	public void setCards(List<Madness> cards) {
		this.cards = cards;
	}
	
	
}
