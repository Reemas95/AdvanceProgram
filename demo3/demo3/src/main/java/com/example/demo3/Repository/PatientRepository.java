package com.example.demo3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient , Long> {

	List<Patient> findByPatientId(Long PatientId);
	
}
