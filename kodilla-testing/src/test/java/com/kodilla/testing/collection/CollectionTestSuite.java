package com.kodilla.testing.collection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//import java.util.*; DLACZEGO TO ZNIKNO?? bo jest package???
//import com.kodilla.testing.collection.OddNumbersExterminator;
//import org.junit.jupiter.api.*;


@DisplayName("Collection test suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }


    @DisplayName("Testing without anu numbers")
    @Test
    void testOddNumbersExterminatorEmptyList() {


        List<Integer> list = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> printList = exterminator.exterminate(list);

        System.out.println(printList);
    }

    @DisplayName("Testing with odd and even numbers")
    @Test
    void testOddNumbersExterminatorNormalList () {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> printList = exterminator.exterminate(list);

        System.out.println(printList);
    }

}