package com.shipwrecked.game.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="wreckage_cards")
public class Wreckage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String effect;
	private String use;
	
	public Wreckage(String name, String effect, String use) {
		this.name=name;
		this.effect=effect;
		this.use=use;
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

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}
	
	
}

