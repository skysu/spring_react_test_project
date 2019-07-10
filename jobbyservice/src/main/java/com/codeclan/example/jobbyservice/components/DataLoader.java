package com.codeclan.example.jobbyservice.components;

import com.codeclan.example.jobbyservice.models.Company;
import com.codeclan.example.jobbyservice.models.Jobby;
import com.codeclan.example.jobbyservice.models.Profile;
import com.codeclan.example.jobbyservice.repositories.CompanyRepository;
import com.codeclan.example.jobbyservice.repositories.JobbyRepository;
import com.codeclan.example.jobbyservice.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    CompanyRepository companyRepository;

    @Autowired
    ProfileRepository profileRepository;

    @Autowired
    JobbyRepository jobbyRepository;

    public DataLoader() {

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Company codeClan = new Company("CodeClan", "https://media.licdn.com/dms/image/C560BAQH_wG8dM7Z4jA/company-logo_400_400/0?e=1570665600&v=beta&t=veGwTkt39DCZ8TjCzC9cxsBTewGIvU1YWlU9XpND5Ns");
        companyRepository.save(codeClan);

        Company careSourcer = new Company("Care Sourcer", "https://media.licdn.com/dms/image/C4E0BAQE4xxLbDqB9fA/company-logo_400_400/0?e=1570665600&v=beta&t=CdJgZsywhw4N6Y_I7t2gUO1E6edjgE_kWTY9ale9PrQ");
        companyRepository.save(careSourcer);

        Company randomHouse = new Company("Random House", "https://media.licdn.com/dms/image/C4D0BAQEiFPeBDlGcQA/company-logo_400_400/0?e=1570665600&v=beta&t=5O-xYk77SDQtlWMHJUY71VloTK9jXG7Pqd6wWf6wROk");
        companyRepository.save(randomHouse);

        Profile sky = new Profile("Sky", "Su");
        profileRepository.save(sky);

        Profile alex = new Profile("Alex", "Bazlinton");
        profileRepository.save(alex);

        Profile katie = new Profile("Katie", "Jeffree");
        profileRepository.save(katie);

        Jobby jobby = new Jobby("Lead Instructor", alex, codeClan);
        jobbyRepository.save(jobby);

        Jobby jobby1 = new Jobby("Teaching Assistant", sky, codeClan);
        jobbyRepository.save(jobby1);

        Jobby jobby2 = new Jobby("Teaching Assistant", katie, codeClan);
        jobbyRepository.save(jobby2);
    }
}
