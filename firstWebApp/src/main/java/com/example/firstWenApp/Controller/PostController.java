package com.example.firstWenApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class PostController {
	
	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World!";
	}

}