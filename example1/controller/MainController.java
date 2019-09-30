package com.example1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.entity.A;
import com.example1.entity.Aa;
import com.example1.entity.B;
import com.example1.entity.Bb;
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
		
		Aa aa = new Aa();
		Bb bb = new Bb();
		
		//saveUniOneToOne(Integer.toUnsignedLong(20));
		
		return "Saved";
	}
	
	@RequestMapping("/read")
	public String readPage() {
		
		return "Value: ";
	}
	
	public void saveUniOneToOne(Long B_id){
		A a = new A();
		B b = new B();
		
		b.setId(B_id);
		a.setB_id(b);
		
		aRepo.save(a);
	}
	public void readUniOneToOne(Long id) {
		A s = new A();
		s = aRepo.getOne(id);
		System.out.println("S: "+s.getId());
	}
}
