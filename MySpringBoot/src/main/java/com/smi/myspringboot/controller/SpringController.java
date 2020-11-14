package com.smi.myspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product")
public class SpringController {

	@RequestMapping("/home")
	public String home() {
		return "happydiwali";
	}
}
