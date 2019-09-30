package com.example1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example1.entity.Aa;
import com.example1.entity.Aaa;
import com.example1.entity.Bb;
import com.example1.entity.Bbb;
import com.example1.repositories.AaRepository;
import com.example1.repositories.AaaRepository;

@RestController
public class MainController {

	private AaaRepository aaaRepo;
	
	@Autowired
	MainController(AaaRepository t ){
		this.aaaRepo = t;
	}
	
	@RequestMapping("/")
	public String startPage() {
		
		Aaa aaa = new Aaa();
		Bbb bbb = new Bbb();
		bbb.setId(Integer.toUnsignedLong(9));
		Bbb bbb1 = new Bbb();
		bbb1.setId(Integer.toUnsignedLong(10));
		
		aaa.add(bbb);
		aaa.add(bbb1);
		
		aaaRepo.save(aaa);
		System.out.println("Result: "+aaaRepo.toString());
		
		
		return "Saved";
	}
	
	@RequestMapping("/read")
	public String readPage() {
	
		List<Aaa> aaa = new ArrayList();
		aaa = aaaRepo.findAll();
		
		String s="";
		for(Aaa temp: aaa) {
			System.out.println("Result: "+temp.getId());
			s+=temp.getId()+" ";
		}
		return "Value: "+s;
	}
	

}
