package com.codeclan.example.jobbyservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "jobbies")
public class Jobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

//    @JsonIgnoreProperties("jobbies")
    @ManyToOne
    @JoinColumn(name = "profile_id", nullable = false)
    private Profile profile;

//    @JsonIgnoreProperties("jobbies")
    @ManyToOne
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;


    public Jobby() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Jobby(String title, Profile profile, Company company) {
        this.title = title;
        this.profile = profile;
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
