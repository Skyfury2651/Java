package com.example.java_employer.controllers;

import com.example.java_employer.entity.Employers;
import com.example.java_employer.repositories.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "/employees")
public class EmployerController {
    @Autowired
    private EmployerRepository employeesRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Employers createEmployee(@RequestBody Employers employees) {
        return employeesRepository.save(employees);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Employers> findAllEmployees (){
        return employeesRepository.findAll();
    }
}
