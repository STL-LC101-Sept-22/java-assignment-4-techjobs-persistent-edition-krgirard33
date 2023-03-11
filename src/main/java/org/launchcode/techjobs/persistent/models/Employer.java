package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @NotNull
    @Size(min=3,max=75,message="Location must be between 3-75 characters long")
    private String location;

    public Employer(@Size(min=3,max=75,message="Location must be between 3-75 characters long")String location) {
        super();
        this.location = location;
    }

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
