package com.shipwrecked.game.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="madness_cards")
public class Madness {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String effect;
	private String recovery_desc;
	private int recovery;
	private int steal_forage;
	private String image;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="deck_id")
    private Madness deck;
	
	

	public Madness(String name, String description, String effect, String recovery_desc, int recovery, int steal_forage,
			String image, Madness deck) {
		this.name = name;
		this.description = description;
		this.effect = effect;
		this.recovery_desc = recovery_desc;
		this.recovery = recovery;
		this.steal_forage = steal_forage;
		this.image = image;
		this.deck = deck;
	}
	
	

	public Madness getDeck() {
		return deck;
	}

	public void setDeck(Madness deck) {
		this.deck = deck;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getRecovery_desc() {
		return recovery_desc;
	}

	public void setRecovery_desc(String recovery_desc) {
		this.recovery_desc = recovery_desc;
	}

	public int getRecovery() {
		return recovery;
	}

	public void setRecovery(int recovery) {
		this.recovery = recovery;
	}

	public int getSteal_forage() {
		return steal_forage;
	}

	public void setSteal_forage(int steal_forage) {
		this.steal_forage = steal_forage;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
