package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  TaskFactoryTestSuite {

    @Test
    public void testingPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        Task painting = factory.makeTask(TaskFactory.PAINTING);

        //When
        System.out.println("Is task executed :" + painting.isTaskExecuted());
        painting.executeTask();
        System.out.println("Is task executed :" + painting.isTaskExecuted());

        //Then
        assertEquals("Painting", painting.getTaskName());
    }

    @Test
    public void testingDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        Task driving = factory.makeTask(TaskFactory.DRIVING);

        //When
        System.out.println("Is task executed :" + driving.isTaskExecuted());
        driving.executeTask();
        System.out.println("Is task executed :" + driving.isTaskExecuted());

        //Then
        assertEquals("Driving", driving.getTaskName());

    }

    @Test
    public void testingShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);

        //When
        System.out.println("Is task executed :" + shopping.isTaskExecuted());
        shopping.executeTask();
        System.out.println("Is task executed :" + shopping.isTaskExecuted());

        //Then
        assertEquals("Shopping", shopping.getTaskName());

    }
}
