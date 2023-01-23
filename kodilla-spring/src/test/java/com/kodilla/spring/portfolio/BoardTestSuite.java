package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        List<Task> testListDoneList = new ArrayList<>();
        testListDoneList.add(new Task("Umyć auto"));
        testListDoneList.add(new Task("Zrobić zakupy"));
        List<Task> testListInProgressList = new ArrayList<>();
        testListInProgressList.add(new Task("Nadrobić zaległości"));
        List<Task> testListToDoList = new ArrayList<>();
        testListToDoList.add(new Task("Ogarnąć programowanie"));

        //When
        board.getDoneList().addTask(new Task("Umyć auto"));
        board.getDoneList().addTask(new Task("Zrobić zakupy"));
        board.printDoneList();

        board.getInProgressList().addTask(new Task("Nadrobić zaległości"));
        board.printInProgressList();

        board.getToDoList().addTask(new Task("Ogarnąć programowanie"));
        board.printToDoList();

        //Then
        assertEquals(testListDoneList,board.getDoneList().getTasks());
        assertEquals(testListInProgressList,board.getInProgressList().getTasks());
        assertEquals(testListToDoList,board.getToDoList().getTasks());
    }
}
