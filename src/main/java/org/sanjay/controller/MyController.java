package org.sanjay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@GetMapping("/hello")
	@ResponseBody
	public String getMessage() {
		return "Hello Again";
	}
	
	@GetMapping("/index")
	public String getView() {
		return "index";
	}

}
