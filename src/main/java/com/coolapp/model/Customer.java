package com.coolapp.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {


    private String firstName;
    @Size(min = 1,message = "is required")
    @NotNull(message = "is required")
    private String lastName="";
    @Min(value = 0,message = "must be greater than 0")
    @Max(value = 10,message = "must be lower than 10")
    private int freePass;

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
}
