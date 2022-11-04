package com.qa.dog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.dog.exceptions.DogNotFoundException;
import com.qa.dog.persistence.domain.Dog;
import com.qa.dog.persistence.repo.DogRepo;

@Service
public class DogService {
	
	private DogRepo repo;

	public DogService(DogRepo repo) {
		super();
		this.repo = repo;
	}
	
	public Dog createDog(Dog dog) {
		return this.repo.save(dog);
	}
	
	public Dog getDog(long id) {
		return this.repo.findById(id).get();
	}
	
	public List<Dog> getDogs() {
		return this.repo.findAll();		
	}
	
	public Dog updateDog(Dog newDog, long id) {
		Dog exists = this.repo.findById(id).orElseThrow(() -> new DogNotFoundException());
		
		exists.setAge(newDog.getAge());
		exists.setColour(newDog.getColour());
		exists.setName(newDog.getName());
		
		return this.repo.save(exists);
	}
	
	public void deleteDog(long id) {
		this.repo.deleteById(id);
	}

}
