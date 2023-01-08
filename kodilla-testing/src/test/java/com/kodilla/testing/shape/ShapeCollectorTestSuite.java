package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("ShapeCollector Test Suite")

public class ShapeCollectorTestSuite {


    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddShape(){
        //Given
        ShapeCollector newFigure = new ShapeCollector();

        //When
        newFigure.addFigure(new Circle(2));

        //Then
        Assertions.assertEquals(1, newFigure.listSize());
    }

    @Test
    void testRemoveFigure(){
        //Given
        Circle circle1 = new Circle(2);
        ShapeCollector newFigure = new ShapeCollector();
        newFigure.addFigure(circle1);

        //When
        boolean result = newFigure.removeFigure(circle1);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, newFigure.listSize());
    }

    @Test
    void testGetFigure(){
        //Given
        Circle circle1 = new Circle(2);
        ShapeCollector newFigure = new ShapeCollector();
        newFigure.addFigure(circle1);

        //When
        Shape shape = newFigure.getFigure(0);

        //Given
        Assertions.assertEquals(circle1, shape);

    }

    @Test
    void testShowFigures(){
        //Given
        Circle circle1 = new Circle(2);
        ShapeCollector newFigure = new ShapeCollector();
        newFigure.addFigure(circle1);

        //When
        String allFigures = newFigure.showFigures();

        //Then
        Assertions.assertEquals(allFigures, circle1.getShapeName());
    }
}
