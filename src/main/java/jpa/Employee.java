package jpa;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

/**
 * Created by zemoso on 12/7/17.
 */
@Entity
@Table(name ="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eid;

    @NotNull
    private String name;

    @NotNull
    private String phone;

    @NotNull
    private String email;

    @NotNull
    private Timestamp joinedOn;

    @NotNull
    private Timestamp dob;

    @NotNull
    private String aadharId;

    @NotNull
    private String city;

    public Employee() {}

    public Employee(int id){
        this.eid = eid;
    }

    public Employee(String name, String phone, String email, Timestamp joinedOn, Timestamp dob,
                    String aadharId, String city) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.joinedOn = joinedOn;
        this.dob = dob;
        this.aadharId = aadharId;
        this.city = city;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getJoinedOn() {
        return joinedOn;
    }

    public void setJoinedOn(Timestamp joinedOn) {
        this.joinedOn = joinedOn;
    }

    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    public String getAadharId() {
        return aadharId;
    }

    public void setAadharId(String aadharId) {
        this.aadharId = aadharId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}