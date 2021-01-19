package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertCsv {
	@Autowired
	Csvjsonmain csv;
	@GetMapping(value="/test")
	public String test()
	{
		return csv.csvToJson();
		
	}

}
