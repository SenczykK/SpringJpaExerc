package com.example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.entity.A;
import com.example1.entity.B;
import com.example1.repositories.ARepository;

@RestController
public class MainController {

	private ARepository aRepo;
	
	@Autowired
	MainController(ARepository t ){
		this.aRepo = t;
	}
	
	@RequestMapping("/")
	public String startPage() {
		
		A a = new A();
		B b = new B();
		
		b.setId(Integer.toUnsignedLong(2));
		a.setB_id(b);
		
		aRepo.save(a);
		return "Saved";
	}
	
	@RequestMapping("/read")
	public String readPage() {
		
		A s = new A();
		s = aRepo.getOne(Integer.toUnsignedLong(4));
		System.out.println("S: "+s.getId());
		return "Value: "+s.toString();
	}
}
