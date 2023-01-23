package com.kodilla.spring.portfolio;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task1 = (Task) o;

        return Objects.equals(task, task1.task);
    }

    @Override
    public int hashCode() {
        return task != null ? task.hashCode() : 0;
    }
}
