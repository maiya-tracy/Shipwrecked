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
@Table(name="night_cards")
public class Night {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String description;
	private String repercussion_desc;
	private String negates_with;
	private String image;
	private int damage;
	private boolean no_fire_tomorrow;
	private boolean destroy_shelter;
	private boolean loose_forage;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="deck_id")
    private NightDeck deck;
	
	
	
	



	public Night(String name, String description, String repercussion_desc,
			String negates_with, String image, int damage, boolean no_fire_tomorrow, boolean destroy_shelter,
			boolean loose_forage, NightDeck deck) {
		this.name = name;
		this.description = description;
		this.repercussion_desc = repercussion_desc;
		this.negates_with = negates_with;
		this.image = image;
		this.damage = damage;
		this.no_fire_tomorrow = no_fire_tomorrow;
		this.destroy_shelter = destroy_shelter;
		this.loose_forage = loose_forage;
		this.deck = deck;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public boolean isNo_fire_tomorrow() {
		return no_fire_tomorrow;
	}

	public void setNo_fire_tomorrow(boolean no_fire_tomorrow) {
		this.no_fire_tomorrow = no_fire_tomorrow;
	}

	public boolean isDestroy_shelter() {
		return destroy_shelter;
	}

	public void setDestroy_shelter(boolean destroy_shelter) {
		this.destroy_shelter = destroy_shelter;
	}

	public boolean isLoose_forage() {
		return loose_forage;
	}

	public void setLoose_forage(boolean loose_forage) {
		this.loose_forage = loose_forage;
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

	public String getRepercussion_desc() {
		return repercussion_desc;
	}

	public void setRepercussion_desc(String repercussion_desc) {
		this.repercussion_desc = repercussion_desc;
	}


	public String getNegates_with() {
		return negates_with;
	}

	public void setNegates_with(String negates_with) {
		this.negates_with = negates_with;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
