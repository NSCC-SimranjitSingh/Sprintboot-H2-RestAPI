package com.example.sprintbooth2restapi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Person_Detail")
public class PersonDetail {

    @Id
    private Long id;

    @Column(name = "dob")
    private Date dob;

    @Column (name ="createdBY")
    private String createdBy;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="person_id")
    private Person person;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCreatedBy(String qwretr) {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
