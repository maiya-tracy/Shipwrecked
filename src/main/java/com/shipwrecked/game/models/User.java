package com.shipwrecked.game.models;

import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "players")
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
	
	private int health;
	private ArrayList<Object> inventory;
	private ArrayList<Object> starting_item;
	private boolean weather_protection;
	private boolean animal_protection;
	
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

	public User() {}

	
	
	public User(String userName, Game game,
			ArrayList<Object> inventory, ArrayList<Object> starting_item, boolean weather_protection,
			boolean animal_protection) {
		this.userName = userName;
		this.game = game;
		this.health = 3;
		this.inventory = inventory;
		this.starting_item = starting_item;
		this.weather_protection = weather_protection;
		this.animal_protection = animal_protection;
	}
	
	public int starting_health() {
		int random = (int) Math.floor((Math.random()*3));
		return 3+random;
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

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public ArrayList<Object> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Object> inventory) {
		this.inventory = inventory;
	}

	public ArrayList<Object> getStarting_item() {
		return starting_item;
	}

	public void setStarting_item(ArrayList<Object> starting_item) {
		this.starting_item = starting_item;
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
