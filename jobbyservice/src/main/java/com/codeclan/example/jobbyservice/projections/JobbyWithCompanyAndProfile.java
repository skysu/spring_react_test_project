package com.codeclan.example.jobbyservice.projections;

import com.codeclan.example.jobbyservice.models.Company;
import com.codeclan.example.jobbyservice.models.Jobby;
import com.codeclan.example.jobbyservice.models.Profile;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "JobbyWithCompanyAndProfile", types = Jobby.class)
public interface JobbyWithCompanyAndProfile {
    Long getId();
    String getTitle();
    Profile getProfile();
    Company getCompany();
}
