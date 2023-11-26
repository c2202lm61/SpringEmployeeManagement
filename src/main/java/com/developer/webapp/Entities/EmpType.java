package com.developer.webapp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmpType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int EmpTypeID;
    private String EmpTypeName;

    public int getEmpTypeID() {
        return EmpTypeID;
    }

    public void setEmpTypeID(int empTypeID) {
        EmpTypeID = empTypeID;
    }

    public String getEmpTypeName() {
        return EmpTypeName;
    }

    public void setEmpTypeName(String empTypeName) {
        EmpTypeName = empTypeName;
    }
}
