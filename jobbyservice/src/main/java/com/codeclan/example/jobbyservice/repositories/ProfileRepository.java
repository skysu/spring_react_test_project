package com.codeclan.example.jobbyservice.repositories;

import com.codeclan.example.jobbyservice.models.Profile;
import com.codeclan.example.jobbyservice.projections.ProfileWithJobbies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//@RepositoryRestResource(excerptProjection = EmbedJobbies.class)
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    ProfileWithJobbies findProfileById(Long id);
}
