package com.codeclan.example.jobbyservice.configurations;

import com.codeclan.example.jobbyservice.projections.JobbyWithCompany;
import com.codeclan.example.jobbyservice.projections.ProfileWithJobbies;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration repositoryRestConfiguration) {
        repositoryRestConfiguration.getProjectionConfiguration()
                .addProjection(ProfileWithJobbies.class)
                .addProjection(JobbyWithCompany.class);
    }

}
