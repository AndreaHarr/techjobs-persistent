package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity

public class Skill extends AbstractEntity {


    @ManyToMany(mappedBy = "skills")
    public List<Job> jobs = new ArrayList<>();

    @Size(min = 3, max = 255, message = "Skill must be between 3 and 255 characters")
    private String description;

    public Skill() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
