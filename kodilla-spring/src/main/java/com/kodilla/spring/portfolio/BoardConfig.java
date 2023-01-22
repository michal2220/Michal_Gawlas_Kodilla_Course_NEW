package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {return new Board(toDoList(),inProgressList(),doneList());}

    @Bean
    public TaskList toDoList(){
        return new TaskList();
    }
    @Bean
    public TaskList inProgressList(){
        return new TaskList();
    }
    @Bean
    public TaskList doneList(){
        return new TaskList();
    }




}
