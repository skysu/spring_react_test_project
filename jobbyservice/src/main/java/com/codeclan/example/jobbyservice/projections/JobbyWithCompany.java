package com.codeclan.example.jobbyservice.projections;

import com.codeclan.example.jobbyservice.models.Company;
import com.codeclan.example.jobbyservice.models.Jobby;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "JobbyWithCompany", types = Jobby.class)
public interface JobbyWithCompany {
    Long getId();
    String getTitle();
    Company getCompany();
}
