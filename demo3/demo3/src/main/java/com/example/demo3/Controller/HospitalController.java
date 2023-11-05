package com.example.demo3.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo3.Entity.Hospital;
import com.example.demo3.Repository.HospitalRepository;

@RestController
@RequestMapping("/hospitals")
public class HospitalController {
	
	@Autowired
	HospitalRepository hospitalRep;
	
	@GetMapping
	List<Hospital> getAllHospitals()  {
	return	hospitalRep.findAll();
	}
	
	@GetMapping("/{id}")
	Optional<Hospital> getHospital(@PathVariable Long id) {
		return hospitalRep.findById(id);
	}
	
	@PostMapping("new")
	String newHospital(@RequestBody Hospital hos) {
	     hospitalRep.save(hos);
		return "hospital Saved!";
	}
		
}
