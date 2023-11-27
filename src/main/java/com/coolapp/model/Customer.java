package com.coolapp.model;

import com.coolapp.CourseCode;
import jakarta.validation.constraints.*;


public class Customer {


    private String firstName;
    @Size(min = 1,message = "is required")
    @NotNull(message = "is required")
    private String lastName="";
    @NotNull(message = "is required")
    @Min(value = 0,message = "must be greater than 0")
    @Max(value = 10,message = "must be lower than 10")
    private Integer freePass;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "Only five char")
    private String postalCode;
    @CourseCode(value = "EBG",message = "must be start with EBG")
    private String courseCode;
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

    public Integer getFreePass() {
        return freePass;
    }

    public void setFreePass(Integer freePass) {
        this.freePass = freePass;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
