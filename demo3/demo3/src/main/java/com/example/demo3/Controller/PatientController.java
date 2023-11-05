package com.example.demo3.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo3.Entity.Patient;
import com.example.demo3.Entity.Hospital;
import com.example.demo3.Repository.PatientRepository;
import com.example.demo3.Repository.HospitalRepository;



@RestController
@RequestMapping("/patients")
public class PatientController {

	@Autowired
	PatientRepository patRepo;
	@Autowired
	HospitalRepository hosRepo;
	
	@GetMapping
	List<Patient> getPatients() {
		return patRepo.findAll();
	}
	
	@GetMapping("/{id}")
	Optional<Patient> getPatients(@PathVariable Long id) {
		return patRepo.findById(id);
	}
	
	String newPatient(@PathVariable long id , @RequestBody Patient pa) {
		for(Hospital t : hosRepo.findAll()) {
			if(t.getId()==id) {
				pa.setHospital(t);
				break;
			}
		}
		patRepo.save(pa);
		
		return "Patient saved!";
	}
	
}
