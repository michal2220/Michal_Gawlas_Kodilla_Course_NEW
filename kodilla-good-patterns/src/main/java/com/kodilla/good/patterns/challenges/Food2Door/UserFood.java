package com.kodilla.good.patterns.challenges.Food2Door;

public class UserFood {

    private String firstName;
    private String lastName;
    private String userID;

    public UserFood(String firstName, String lastName, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserID() {
        return userID;
    }
}
