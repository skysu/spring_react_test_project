package com.codeclan.example.jobbyservice.controllers;

import com.codeclan.example.jobbyservice.projections.ProfileWithJobbies;
import com.codeclan.example.jobbyservice.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/profiles")
public class MyProfileController {

    @Autowired
    ProfileRepository profileRepository;

    @GetMapping(value = "/{id}")
    public ProfileWithJobbies getProfileById(@PathVariable Long id) {
        return profileRepository.findProfileById(id);
    }

}
