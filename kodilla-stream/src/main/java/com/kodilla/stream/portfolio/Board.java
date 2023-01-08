package com.kodilla.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private final List<TaskList> taskLists = new ArrayList<TaskList>();
    private final String name;

    public Board(final String name) {
        this.name = name;
    }

    public void addTaskList (TaskList taskList){
        taskLists.add(taskList);
    }

    public boolean removeTaskList(TaskList taskList){
        return taskLists.remove(taskList);
    }

    public List<TaskList> getTaskLists(){
        return new ArrayList<>(taskLists);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Board{" + "\n" +
                "name='" + name + '\'' + ",\n" +
                "taskLists=" + taskLists + "\n" +
                '}';
    }

 /*   public long averageTime(Board project ){

        List<TaskList> inProgress = new ArrayList<>();

        long completionTime = project.getTaskLists().stream()
                .filter(inProgress::contains)
                .flatMap(tl->tl.getTasks().stream())
                .map(d-> ChronoUnit.DAYS.between(d.getCreated(), LocalDate.now()))
                .map(d->d.getDays()).mapToInt(Integer::intValue).sum();

        long tasksSize=project.getTaskLists().stream()
                .filter(inProgress::contains)
                .flatMap(tl->tl.getTasks().stream()).map(Task::getTitle)
                .count();
        long average = completionTime/tasksSize;

        return average;
    }
*/


}
