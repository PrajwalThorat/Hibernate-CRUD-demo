package org.stackroute.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
	@Id
	@Column(name = "per_id")
	private int id;
	
	@Column(name = "per_name")
	private String name;
	
	@Column(name = "per_city")
	private String city;
	
	public Person() {
	}

	
	public Person(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
}
