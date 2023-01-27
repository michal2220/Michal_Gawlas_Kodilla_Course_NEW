package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask (final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Shopping", "Milk", 3);
            case PAINTING -> new PaintingTask("Painting", "White", "Living room");
            case DRIVING -> new DrivingTask("Driving", "To shop", "Car");
            default -> null;
        };
    }
}
