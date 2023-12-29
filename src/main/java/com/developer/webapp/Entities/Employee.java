package com.developer.webapp.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotNull
    @Size(min = 2, max = 50)
    @Column(length = 50)
    private String Name;
    @NotNull
    @Size(min = 6, max = 100)
    @Column(length = 100, unique = true)
    private String Username;
    @NotNull
    @Size(min = 8, max = 50)
    @Column(length = 50,nullable = false)
    private String Password;
    @NotNull
    @Size(max = 150)
    @Column(length = 150)
    private String Address;
    @NotNull
    @Size(min = 8, max = 13)
    @Column(length = 13,nullable = false)
    private String Phone;
    @ManyToOne
    @JoinColumn(name = "departmentId")
    private Department department;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
