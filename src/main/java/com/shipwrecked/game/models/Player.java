package com.shipwrecked.game.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="players")
public class Player{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int health;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "forage_player", 
        joinColumns = @JoinColumn(name = "player_id"), 
        inverseJoinColumns = @JoinColumn(name = "forage_id")
    )
	private List<Forage> inventory;
	

	private boolean weather_protection;
	private boolean animal_protection;
	
	
	public Player(String name, int health, List<Forage> inventory, boolean weather_protection,
			boolean animal_protection) {

		this.name = name;
		this.health = health;
		this.inventory = inventory;
		this.weather_protection = false;
		this.animal_protection = false;
	}

	// PLAYER ACTIONS
	public void dealCards(int heart, ForageDeck deck) {
		for(int i = 0; i< heart; i++) {
			this.inventory.add(deck.deal());
			this.health--;
		}
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setInventory(List<Forage> inventory) {
		this.inventory = inventory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public List<Forage> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Forage> inventory) {
		this.inventory = inventory;
	}


	public boolean isWeather_protection() {
		return weather_protection;
	}

	public void setWeather_protection(boolean weather_protection) {
		this.weather_protection = weather_protection;
	}

	public boolean isAnimal_protection() {
		return animal_protection;
	}

	public void setAnimal_protection(boolean animal_protection) {
		this.animal_protection = animal_protection;
	}

	
	
	
	
}

