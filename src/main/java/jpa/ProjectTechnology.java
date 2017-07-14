package jpa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by zemoso on 12/7/17.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "ProjectTechnology")
public class ProjectTechnology {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private int pid;

    @NotNull
    private String technology;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public ProjectTechnology(){}

    public ProjectTechnology(int pid, String technology, Project project) {
        this.pid = pid;
        this.technology = technology;
    }
}
