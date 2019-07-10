package com.codeclan.example.jobbyservice.projections;

import com.codeclan.example.jobbyservice.models.Company;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "CompanyWithJobbies", types = Company.class)
public interface CompanyWithJobbies {
    Long getId();
    String getName();
    String getLogo();
    List<JobbyWithProfile> getJobbies();
}
