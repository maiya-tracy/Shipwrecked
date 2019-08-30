package com.shipwrecked.game.models;

public class Repercussion {
	
	private int damage;
	
	private boolean no_fire_tomorrow;
	
	private boolean destroy_shelter;
	
	private boolean lose_forage;

	public Repercussion(int damage, boolean no_fire_tomorrow, boolean destroy_shelter, boolean lose_forage) {
		this.damage = damage;
		this.no_fire_tomorrow = no_fire_tomorrow;
		this.destroy_shelter = destroy_shelter;
		this.lose_forage = lose_forage;
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

	public boolean isLose_forage() {
		return lose_forage;
	}

	public void setLose_forage(boolean lose_forage) {
		this.lose_forage = lose_forage;
	}
	

}
