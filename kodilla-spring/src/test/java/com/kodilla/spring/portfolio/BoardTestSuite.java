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

        //When
        board.getDoneList().addTask();
        board.getDoneList().addTask();
        board.printDoneList();

        board.getInProgressList().addTask2();
        board.printInProgressList();

        board.getToDoList().addTask();
        board.getToDoList().addTask2();
        board.printToDoList();

        //Then
        List<String> testListDoneList = new ArrayList<>();
        testListDoneList.add("Nowe zadania");
        testListDoneList.add("Nowe zadania");

        List<String> testListInProgressList = new ArrayList<>();
        testListInProgressList.add("Inne zadania");

        List<String> testListToDoList = new ArrayList<>();
        testListToDoList.add("Nowe zadania");
        testListToDoList.add("Inne zadania");

        assertEquals(testListDoneList,board.getDoneList().getTasks());
        assertEquals(testListInProgressList,board.getInProgressList().getTasks());
        assertEquals(testListToDoList,board.getToDoList().getTasks());
    }
}
