package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import javax.sound.sampled.FloatControl;
@Entity
public class Employer extends AbstractEntity {
    @NotBlank
    @Size(max = 225)
    private String location;

    public Employer() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}