package com.example.demo3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.Entity.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital , Long>{

}
