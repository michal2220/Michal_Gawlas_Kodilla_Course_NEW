package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;


public class TaskList {

    private final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(){
        tasks.add("Nowe zadania");
    }

    public void addTask2(){
        tasks.add("Inne zadania");
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
