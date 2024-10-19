package com.example.demo.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name= "saints")
public class Saint {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate birthDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate deathDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate feastDay;
	private String patronOf;
	private String biography;
	
	//Getters and Setters
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the birthDate
	 */
	public LocalDate getBirthDate() {
		return birthDate;
	}
	/**
	 * @param birthDate the birthDate to set
	 */
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * @return the deathDate
	 */
	public LocalDate getDeathDate() {
		return deathDate;
	}
	/**
	 * @param deathDate the deathDate to set
	 */
	public void setDeathDate(LocalDate deathDate) {
		this.deathDate = deathDate;
	}
	/**
	 * @return the feastDay
	 */
	public LocalDate getFeastDay() {
		return feastDay;
	}
	/**
	 * @param feastDay the feastDay to set
	 */
	public void setFeastDay(LocalDate feastDay) {
		this.feastDay = feastDay;
	}
	/**
	 * @return the patronOf
	 */
	public String getPatronOf() {
		return patronOf;
	}
	/**
	 * @param patronOf the patronOf to set
	 */
	public void setPatronOf(String patronOf) {
		this.patronOf = patronOf;
	}
	/**
	 * @return the biography
	 */
	public String getBiography() {
		return biography;
	}
	/**
	 * @param biography the biography to set
	 */
	public void setBiography(String biography) {
		this.biography = biography;
	}
	
	
	
	
	
}
