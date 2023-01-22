package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


public class TaskList {

    private final List<Task> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    };
    public List<Task> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
