package jpa;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * Created by zemoso on 12/7/17.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "EmployeeProject")
public class EmployeeProject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private int eid;

    @NotNull
    private int pid;

    @NotNull
    private Timestamp startedOn;

    @NotNull
    private Timestamp endedOn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Timestamp getStartedOn() {
        return startedOn;
    }

    public void setStartedOn(Timestamp startedOn) {
        this.startedOn = startedOn;
    }

    public Timestamp getEndedOn() {
        return endedOn;
    }

    public void setEndedOn(Timestamp endedOn) {
        this.endedOn = endedOn;
    }

    public EmployeeProject(){}

    public EmployeeProject(int eid, int pid, Timestamp startedOn, Timestamp endedOn) {
        this.eid = eid;
        this.pid = pid;
        this.startedOn = startedOn;
        this.endedOn = endedOn;
    }
}