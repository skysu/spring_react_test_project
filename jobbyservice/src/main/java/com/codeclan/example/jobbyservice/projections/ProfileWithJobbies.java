package com.codeclan.example.jobbyservice.projections;

import com.codeclan.example.jobbyservice.models.Company;
import com.codeclan.example.jobbyservice.models.Jobby;
import com.codeclan.example.jobbyservice.models.Profile;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "ProfileWithJobbies", types = Profile.class)
public interface ProfileWithJobbies {
    Long getId();
    String getFirstName();
    String getLastName();
    List<JobbyWithCompany> getJobbies();
}
