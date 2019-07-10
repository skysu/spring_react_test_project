package com.codeclan.example.jobbyservice.controllers;

import com.codeclan.example.jobbyservice.projections.JobbyWithCompanyAndProfile;
import com.codeclan.example.jobbyservice.repositories.JobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/jobbies")
public class JobbyController {

    @Autowired
    JobbyRepository jobbyRepository;

    @GetMapping(value = "/{id}")
    public JobbyWithCompanyAndProfile getJobbyById(@PathVariable Long id) {
        return jobbyRepository.findJobbyById(id);
    }

}
