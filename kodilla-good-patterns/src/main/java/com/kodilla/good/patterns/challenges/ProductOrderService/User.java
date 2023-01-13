package com.kodilla.good.patterns.challenges.ProductOrderService;

public class User {

    private String firstName;
    private String lastName;
    private String userID;

    public User(String firstName, String lastName, String userID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }
}
