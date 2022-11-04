package com.qa.dog.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.dog.persistence.domain.Dog;


@Repository
public interface DogRepo extends JpaRepository<Dog, Long> {
	

}
