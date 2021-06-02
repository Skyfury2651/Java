package com.example.java_employer.repositories;

import com.example.java_employer.entity.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployerRepository extends JpaRepository<Employers, Integer> {

}