package jpa;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zemoso on 12/7/17.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "Project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long pid;

    @NotNull
    private String title;

    @NotNull
    private Timestamp startedOn;

    @JsonIgnore
    @OneToMany()
    @JoinColumn(name="pid", insertable=false, updatable=false)
    private List<ProjectTechnology> projectTechnology;

    public List<ProjectTechnology> getProjectTechnology() {
        return projectTechnology;
    }

    public void setProjectTechnology(List<ProjectTechnology> projectTechnology) {
        this.projectTechnology = projectTechnology;
    }

    public List<EmployeeProject> getEmployeeProjects() {
        return employeeProjects;
    }

    public void setEmployeeProjects(List<EmployeeProject> employeeProjects) {
        this.employeeProjects = employeeProjects;
    }

    @JsonIgnore
    @OneToMany()
    @JoinColumn(name="pid", insertable=false, updatable=false)
    private List<EmployeeProject> employeeProjects;

    public Project() {
    }

    public Project(String title, Timestamp startedOn, List<ProjectTechnology> projectTechnology,
                   List<EmployeeProject> employeeProjects) {
        this.title = title;
        this.startedOn = startedOn;
        this.projectTechnology = projectTechnology;
        this.employeeProjects=employeeProjects;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(Timestamp startedOn) {
        this.startedOn = startedOn;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Project{");
        sb.append("pid=").append(pid);
        sb.append(", title='").append(title).append('\'');
        sb.append(", startedOn=").append(startedOn);
        sb.append(", projectTechnology=").append(projectTechnology);
        sb.append('}');
        return sb.toString();
    }
}



