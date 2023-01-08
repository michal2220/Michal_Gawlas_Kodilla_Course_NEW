package com.kdilla.exception.test.finalTask;

public class TaskMain {

    public static void main (String[]args) {

        SearchEngine searchEngine = new SearchEngine();
        Flight flight1 = new Flight("asd","Kraków");

        try {
            searchEngine.findFlight(flight1);
        } catch (RouteNotFoundException e){
            System.out.println("No such flight");
        } finally {
            System.out.println("THak You for using ERLAJNS air lines");
        }
    }
}
