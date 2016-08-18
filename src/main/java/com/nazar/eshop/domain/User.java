package com.nazar.eshop.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "user")
public class User extends NamedEntity {

	private String email;
	
	private LocalDate birth;
	
	private String role;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getBirth() {
		return birth;
	}
	
	@JsonProperty("birth")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd") 
	public void setBirthDate(java.util.Date date) {
		birth = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).toLocalDate();
	}
	
	public void setBirth(LocalDate birth) {
		this.birth = birth;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return name + " <" + email + ">" 
					+ (birth == null ? "" : " (birth: " + birth + ")");
	}
	
}
