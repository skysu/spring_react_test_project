package com.codeclan.example.jobbyservice.controllers;

import com.codeclan.example.jobbyservice.projections.CompanyWithJobbies;
import com.codeclan.example.jobbyservice.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/companies")
public class CompanyController {

    @Autowired
    CompanyRepository companyRepository;
    //Hello Sky, this works?

    @GetMapping(value = "/{id}")
    public CompanyWithJobbies getCompanyById(@PathVariable Long id) {
        return companyRepository.findCompanyById(id);
    }

}
