package com.example.gym;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Frans {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Name;
	private String Email;
	private Long Mobilenumber;
	private String City;
	public Frans() {
		
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public Long getMobilenumber() {
		return Mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.Mobilenumber = mobilenumber;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		this.City = city;
	}
	
	public Frans(String name, String email, Long mobilenumber, String city) {
		super();
		this.Name = name;
		this.Email = email;
		this.Mobilenumber = mobilenumber;
		this.City = city;
	}
	
}