package com.example1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Bbb {
	
	@Id
	private Long id;
	
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
	@JoinColumn(name="Aaa_id")
	private Aaa aaa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aaa getAaa() {
		return aaa;
	}

	public void setAaa(Aaa aaa) {
		this.aaa = aaa;
	}
	
	
}
