package com.example.firstTry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class new02 {
	
	@GetMapping("hello")
	
	public String SayHello(){
		return "Second Page of Sprin Boot !!!";
	}

}
