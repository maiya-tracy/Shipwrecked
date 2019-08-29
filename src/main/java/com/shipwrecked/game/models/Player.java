package com.shipwrecked.game.models;

import java.util.ArrayList;

public class Player{
	private String name;
	private int health;
	private ArrayList<Object> inventory;
	private ArrayList<Object> starting_item;
	private boolean weather_protection;
	private boolean animal_protection;
	
	public Player(ArrayList<Object> starting_item, String name) {
		this.name = name;
		this.health = starting_health();
		this.starting_item = new ArrayList<Object>();
		this.inventory = new ArrayList<Object>();
		this.weather_protection = false;
		this.animal_protection = false;
	}
	
	private int starting_health() {
		int random = (int) (Math.random()*3+1);
		return 3+random;
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

