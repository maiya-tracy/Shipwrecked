package com.shipwrecked.game.models;

import java.util.List;

public class Night {
	private String name;
	private String description;
	private String repercussion_desc;
	private List<Repercussion> repercussion;
	private boolean negates_with;
	private String image;

public Night(String name, String description, String repercussion_desc, List<Repercussion> repercussion,
			boolean negates_with, String image) {
		super();
		this.name = name;
		this.description = description;
		this.repercussion_desc = repercussion_desc;
		this.repercussion = repercussion;
		this.negates_with = negates_with;
		this.image = image;
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


	public List<Repercussion> getRepercussion() {
		return repercussion;
	}


	public void setRepercussion(List<Repercussion> repercussion) {
		this.repercussion = repercussion;
	}


	public boolean isNegates_with() {
		return negates_with;
	}


	public void setNegates_with(boolean negates_with) {
		this.negates_with = negates_with;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


}
