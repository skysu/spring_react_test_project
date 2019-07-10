package com.codeclan.example.jobbyservice.repositories;

import com.codeclan.example.jobbyservice.models.Jobby;
import com.codeclan.example.jobbyservice.projections.JobbyWithCompanyAndProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource(excerptProjection = JobbyWithCompanyAndProfile.class)
public interface JobbyRepository extends JpaRepository<Jobby, Long> {
    JobbyWithCompanyAndProfile findJobbyById(Long id);
}
