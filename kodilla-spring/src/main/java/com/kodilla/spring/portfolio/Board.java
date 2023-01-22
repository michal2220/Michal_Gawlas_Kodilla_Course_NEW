package com.kodilla.spring.portfolio;

import java.util.stream.Collectors;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void printToDoList() {
        System.out.println("To do: " + toDoList.getTasks().stream()
                .map(Task::getTask).collect(Collectors.toList()));
    }

    public void printInProgressList() {
        System.out.println("In progress: " + inProgressList.getTasks().stream()
                .map(Task::getTask).collect(Collectors.toList()));
    }

    public void printDoneList() {
        System.out.println("Done list: " + doneList.getTasks().stream()
                .map(Task::getTask).collect(Collectors.toList()));
    }


}
