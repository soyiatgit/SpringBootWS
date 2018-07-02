package com.saurabh.springboot.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Person {
	
	/**
	 * hibernate automatically adds hibernateLazyInitializer and handler method to
	 * the entity object, hence we need to ignore them for JSON serialization.
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer age;
	private String country;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
	private Date dob;
	private String name;
	private String occupation;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public String getName() {
		return name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}
