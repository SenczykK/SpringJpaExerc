package com.example1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bb {
	
	@Id
	private Long id;
	
	@OneToOne(mappedBy="bb", cascade=CascadeType.ALL)
	private Aa aa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aa getAa() {
		return aa;
	}

	public void setAa(Aa aa) {
		this.aa = aa;
	}
	
	
}
