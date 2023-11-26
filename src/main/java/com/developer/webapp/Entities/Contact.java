package com.developer.webapp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ContactID;
    private int EmpID;
    private LocalDate JoinedDate;
    private String PeriodOfContact;
    private int PostID;
    private int EmpTypeID;
    private int DepID;
    private String Sal;

    public int getContactID() {
        return ContactID;
    }

    public void setContactID(int contactID) {
        ContactID = contactID;
    }

    public int getEmpID() {
        return EmpID;
    }

    public void setEmpID(int empID) {
        EmpID = empID;
    }

    public LocalDate getJoinedDate() {
        return JoinedDate;
    }

    public void setJoinedDate(LocalDate joinedDate) {
        JoinedDate = joinedDate;
    }

    public String getPeriodOfContact() {
        return PeriodOfContact;
    }

    public void setPeriodOfContact(String periodOfContact) {
        PeriodOfContact = periodOfContact;
    }

    public int getPostID() {
        return PostID;
    }

    public void setPostID(int postID) {
        PostID = postID;
    }

    public int getEmpTypeID() {
        return EmpTypeID;
    }

    public void setEmpTypeID(int empTypeID) {
        EmpTypeID = empTypeID;
    }

    public int getDepID() {
        return DepID;
    }

    public void setDepID(int depID) {
        DepID = depID;
    }

    public String getSal() {
        return Sal;
    }

    public void setSal(String sal) {
        Sal = sal;
    }
}
