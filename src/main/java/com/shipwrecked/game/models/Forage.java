package com.shipwrecked.game.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="forage_cards")
public class Forage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String type;
	private String face;
	private String action;
	private int repercussion;
	private String image;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="deck_id")
    private ForageDeck deck;
	

	public Forage(String type, String face, String action, int repercussion, String image, ForageDeck deck) {
		this.type = type;
		this.face = face;
		this.action = action;
		this.repercussion = repercussion;
		this.image = image;
		this.deck = deck;
	}


	@Override
	public boolean equals(Object o) {
		if (o == this)
	        return true;
	    if (!(o instanceof Forage))
	        return false;
	    
	    Forage e = (Forage) o;
	    return Objects.equals(id, e.getId());
	}

	
	public Long getId() {
		return id;
	}





	public void setId(Long id) {
		this.id = id;
	}





	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getFace() {
		return face;
	}


	public void setFace(String face) {
		this.face = face;
	}


	public String getAction() {
		return action;
	}


	public void setAction(String action) {
		this.action = action;
	}


	public int getRepercussion() {
		return repercussion;
	}


	public void setRepercussion(int repercussion) {
		this.repercussion = repercussion;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	
}
