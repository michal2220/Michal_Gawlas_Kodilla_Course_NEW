package com.kdilla.exception.test;


public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge challenger = new SecondChallenge();

        try {
            var result = challenger.probablyIWillThrowException(1,1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("I did throw an exception :)");
        } finally {
            System.out.println("Still here");
        }
    }
}
