package com.example.empportal.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    @JsonFormat(pattern = "dd MMM yyyy" , timezone = "EST")
    private Date dob;
    private String department;

    public EmployeeDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EmployeeDTO(Long id, String firstName, String lastName, String gender, Date dob, String department) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeDTO{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append(", dob=").append(dob);
        sb.append(", department='").append(department).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
