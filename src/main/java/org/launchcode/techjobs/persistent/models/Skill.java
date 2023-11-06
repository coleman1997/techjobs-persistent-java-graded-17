package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();

    private String description;

    public Skill(){
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }
    public void setJobs (Job job) {
        this.jobs.add(job);
    }



}
