package com.example.gym;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Subscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Name;
	private String Email;
	private String Plan;
	private Long Cardnumber;
	private String Expiration;
	private Long Cvv;
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
		Email = email;
	}
	public String getPlan() {
		return Plan;
	}
	public void setPlan(String plan) {
		this.Plan = plan;
	}
	public Long getCardnumber() {
		return Cardnumber;
	}
	public void setCardnumber(Long cardnumber) {
		this.Cardnumber = cardnumber;
	}
	public String getExpiration() {
		return Expiration;
	}
	public void setExpiration(String expiration) {
		this.Expiration = expiration;
	}
	public Long getCvv() {
		return Cvv;
	}
	public void setCvv(Long cvv) {
		this.Cvv = cvv;
	}
	public Subscription(String name, String email, String plan, Long cardnumber, String expiration, Long cvv) {
		super();
		this.Name = name;
		this.Email = email;
		this.Plan = plan;
		this.Cardnumber = cardnumber;
		this.Expiration = expiration;
		this.Cvv = cvv;
	}
}