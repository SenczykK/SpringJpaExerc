package com.example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example1.entity.Aa;
import com.example1.entity.Bb;
import com.example1.repositories.AaRepository;

@RestController
public class MainController {

	private AaRepository aaRepo;
	
	@Autowired
	MainController(AaRepository t ){
		this.aaRepo = t;
	}
	
	@RequestMapping("/")
	public String startPage() {
		
		Aa aa = new Aa();
		Bb bb = new Bb();
		bb.setId(Integer.toUnsignedLong(5));
		aa.setBb(bb);
		aaRepo.save(aa);
		System.out.println("Result: "+aaRepo.toString());
		
		
		return "Saved";
	}
	
	@RequestMapping("/read")
	public String readPage() {
	
		
		return "Value: ";
	}
	

}
