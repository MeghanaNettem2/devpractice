package com.example.form.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.form.entity.Form;
import com.example.form.repository.formrepository;

@RestController
public class formController {
	@Autowired
	formrepository repository;
	@GetMapping("/form")
	public List<Form> getAllforms(){
		return  repository.findAll();
	}
	@PostMapping("/form")
	public Form create(@RequestBody Form obj) {
		return repository.save(obj);
	}
// 	@PostMapping("/form")
// 	public Form create(@RequestBody Form obj) {
// 		return repository.save(obj);
// 	}

	// 	@PostMapping("/form")

// 	public Form create(@RequestBody Form obj) {

// 		return repository.save(obj);

// 	}

}
