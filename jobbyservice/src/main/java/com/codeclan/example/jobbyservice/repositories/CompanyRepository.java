package com.codeclan.example.jobbyservice.repositories;

import com.codeclan.example.jobbyservice.models.Company;
import com.codeclan.example.jobbyservice.projections.CompanyWithJobbies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    CompanyWithJobbies findCompanyById(Long id);
}
