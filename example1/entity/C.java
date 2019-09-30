package com.example1.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import com.example1.enums.Color;
import com.example1.enums.ColorConverter;

@Entity
public class C {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private Long number;
	
	@NotNull
	private String name;
	
	@NotNull
	private LocalDate myDate;
	
	@NotNull
	private LocalDate myDate2;
	
	@NotNull
	@Convert(converter=ColorConverter.class)
	private Color myColor;

	

}
