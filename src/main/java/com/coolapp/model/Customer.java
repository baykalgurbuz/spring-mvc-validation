package com.coolapp.model;

import jakarta.validation.constraints.*;

public class Customer {


    private String firstName;
    @Size(min = 1,message = "is required")
    @NotNull(message = "is required")
    private String lastName="";
    @Min(value = 0,message = "must be greater than 0")
    @Max(value = 10,message = "must be lower than 10")
    private int freePass;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}",message = "Only five char")
    private String postalCode;
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

    public int getFreePass() {
        return freePass;
    }

    public void setFreePass(int freePass) {
        this.freePass = freePass;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
