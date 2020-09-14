package com.sample.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/app")
public class SampleController {

	@GetMapping
	public String hello() {
		return "Hello there!! Java";
	}
}
