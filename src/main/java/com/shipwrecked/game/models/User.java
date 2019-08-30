package com.shipwrecked.game.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 1, message="Username canno't be empty")
	private String userName;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="game_id")
    private Game game;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "forage_player", 
        joinColumns = @JoinColumn(name = "player_id"), 
        inverseJoinColumns = @JoinColumn(name = "forage_id")
    )
	private List<Forage> inventory;
	
	private int health;
	private boolean weather_protection;
	private boolean animal_protection;
	
	
	public User(String userName) {

		this.userName = userName;
		this.health = (int) (Math.random()*3)+3;
		this.weather_protection = false;
		this.animal_protection = false;
	}
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }


	public User() {}
	
	public void drawCard(int heart, ForageDeck deck) {
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

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public List<Forage> getInventory() {
		return inventory;
	}

	public void setInventory(List<Forage> inventory) {
		this.inventory = inventory;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
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
