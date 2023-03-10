package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Skill extends AbstractEntity {

    @Size(max=255, message="Description is limited to 255 characters.")
    private String description;

    public Skill() {}

    public Skill(@Size(max=255, message="Description is limited to 255 characters.")String description) {
        super();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}