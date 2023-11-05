package com.example.demo3.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long patientId;

	String name;
	String surname;

	@ManyToOne
	@JoinColumn(name = "HospitalId")
	Hospital hospital;

	public Long getId() {
		return patientId;
	}

	public void setId(Long id) {
		this.patientId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hos) {
		this.hospital = hos;
	}

}
