package com.example.demo3.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hospital")
public class Hospital {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long HospitalId;
    
    @Column(name="hospital_name")
	String name;
    
    String appointmentTime;
	
    
	public Long getId() {
		return HospitalId;
	}


	public void setId(Long id) {
		this.HospitalId = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTime() {
		return appointmentTime;
	}


	public void setTime(String time) {
		this.appointmentTime = time;
	}

	
}
