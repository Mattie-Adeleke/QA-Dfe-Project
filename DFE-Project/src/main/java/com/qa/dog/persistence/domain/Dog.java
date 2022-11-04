package com.qa.dog.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String colour;

	@Column(unique = true)
	private String name;

	private int age;

	public Dog() {
		super();
		
	}

	public Dog(long id, String colour, String name, int age) {
		super();
		this.id = id;
		this.colour = colour;
		this.name = name;
		this.age = age;
	}

	public Dog(String colour, String name, int age) {
		super();
		this.colour = colour;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getColour() {
		return colour;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
