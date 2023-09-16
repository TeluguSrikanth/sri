package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySecurity 
{
	@GetMapping("/sri")
	public String security()
	{
		return "Welcome Srikanth";
	}

}
