package com.kodilla.spring.portfolio;

public class Task {

    private String task;

    public Task(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task='" + task + '\'' +
                '}';
    }
}
