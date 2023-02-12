package com.kodilla.testing.forum.statistics;

public class Calculations {
    private Statistics statistics;

    public Calculations(Statistics statistics) {
        this.statistics = statistics;
    }

    private int userCount;
    private int postCount;
    private int commentCount;
    private double postPerUser;
    private double commentPerUser;
    private double commentPerPost;

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public double getCommentPerUser() {
        return commentPerUser;
    }

    public double getCommentPerPost() {
        return commentPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();
        postPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();
        commentPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();
        commentPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
    }

    public String showStatistics() {
        String statistics ="User count= " + userCount + "\n" +
                "Post count= " + postCount + "\n" +
                "Comment count= " + commentCount + "\n" +
                "Post per user= " + postPerUser + "\n" +
                "Comment per user= " + commentPerUser + "\n" +
                "Comment per post= " + commentPerPost;
        return statistics;
    }
}
