package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Employee;
import com.demo.service.ServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	ServiceImpl service;
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody Employee employee){
		return new ResponseEntity<>(service.add(employee),HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<?> get(@PathVariable int id){
		return new ResponseEntity<>(service.get(id),HttpStatus.OK);
	}

}
