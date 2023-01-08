package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String name;
    private final char sex;
    private final LocalDate birth;
    private final int postCount;

    public ForumUser(final int userID,final String name,final char sex,final int yearOfBirth,
                     final int monthOfBirth,final int dayOfBirth ,final int postCount) {
        this.userID = userID;
        this.name = name;
        this.sex=sex;
        if(sex=='M'||sex=='F'){
        }else { System.out.println("Provide sex for "+name); }
        this.birth = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getBirthYear() {
        return birth.getYear();
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", bitrh=" + birth +
                ", postCount=" + postCount +
                '}';
    }
}
