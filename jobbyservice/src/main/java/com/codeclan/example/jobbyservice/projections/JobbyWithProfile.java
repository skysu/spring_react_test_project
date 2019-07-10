package com.codeclan.example.jobbyservice.projections;

import com.codeclan.example.jobbyservice.models.Jobby;
import com.codeclan.example.jobbyservice.models.Profile;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "JobbyWithProfile", types = Jobby.class)
public interface JobbyWithProfile {
    Long getId();
    String getTitle();
    Profile getProfile();
}
