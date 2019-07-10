package com.codeclan.example.jobbyservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@JsonIgnoreProperties("jobbies")
@Entity
@Table(name = "companies")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name = "logo")
    private String logo;

//    @JsonIgnoreProperties({ "profile", "company" })
    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
    @Column(name = "jobbies")
    private List<Jobby> jobbies;

    public Company() {
    }

    public Company(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Jobby> getJobbies() {
        return jobbies;
    }

    public void setJobbies(List<Jobby> jobbies) {
        this.jobbies = jobbies;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
