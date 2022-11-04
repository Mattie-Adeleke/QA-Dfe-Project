package com.qa.dog.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.dog.persistence.domain.Dog;
import com.qa.dog.service.DogService;

@RestController
@RequestMapping("/dog")
public class DogController {
	
	private DogService service;

	public DogController(DogService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Dog> createDog(@RequestBody Dog newDog) {
		return new ResponseEntity<Dog>(this.service.createDog(newDog), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/get")
	public List<Dog> getDogs() {
		return this.service.getDogs();
		
	}
	
	@GetMapping("/get/{id}")
	public Dog getDog(@PathVariable Long id) {
		return this.service.getDog(id);
		
	}
	
	@PutMapping("/update/{id}")
	public Dog updateDog(@RequestBody Dog newDog, @PathVariable Long id) {
		return this.service.updateDog(newDog, id);
		
	}
	
	@DeleteMapping("/remove/{id}")
	public void deleteDog(@PathVariable Long id) {
		this.service.deleteDog(id);
	}

}
