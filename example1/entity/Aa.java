package com.example1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="B_id")
	private Bb bb;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Bb getBb() {
		return bb;
	}

	public void setBb(Bb bb) {
		this.bb = bb;
	}
	
	
}
