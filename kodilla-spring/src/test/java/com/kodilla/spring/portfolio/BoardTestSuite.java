package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        List<String> testListDoneList = new ArrayList<>();
        testListDoneList.add("Umyć auto");
        testListDoneList.add("Zrobić zakupy");
        List<String> testListInProgressList = new ArrayList<>();
        testListInProgressList.add("Nadrobić zaległości");
        List<String> testListToDoList = new ArrayList<>();
        testListToDoList.add("Ogarnąć programowanie");


        //When
        board.getDoneList().addTask(new Task("Umyć auto"));
        board.getDoneList().addTask(new Task("Zrobić zakupy"));
        board.printDoneList();

        board.getInProgressList().addTask(new Task("Nadrobić zaległości"));
        board.printInProgressList();

        board.getToDoList().addTask(new Task("Ogarnąć programowanie"));
        board.printToDoList();

        //Then
        assertEquals(testListDoneList,board.getDoneList().getTasks().stream().map(f->f.getTask()).collect(Collectors.toList()));
        assertEquals(testListInProgressList,board.getInProgressList().getTasks().stream().map(f->f.getTask()).collect(Collectors.toList()));
        assertEquals(testListToDoList,board.getToDoList().getTasks().stream().map(f->f.getTask()).collect(Collectors.toList()));
    }
}
