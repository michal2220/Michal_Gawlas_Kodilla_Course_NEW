package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatingStatisticsTestSuite {

    Statistics statisticsMock = mock(Statistics.class);
    Calculations calculations = new Calculations(statisticsMock);


    @Test
    public void testingForZeroUsers() {
        //Given
        List<String> list = new ArrayList<>();

        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(list);

        calculations.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(Double.POSITIVE_INFINITY, calculations.getPostPerUser());
    }

    @Test
    public void testingForThousandUsers() {
        //Given
        List<String> list = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            list.add("user" + n);
        }

        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(list);

        calculations.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, calculations.getPostPerUser());

    }

    @Test
    public void testingForZeroComments() {
        //Given
        List<String> list = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            list.add("user" + n);
        }

        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(list);

        calculations.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculations.getCommentCount());
        assertEquals(0, calculations.getCommentPerUser());
    }

    @Test
    public void testingForMoreCommentsThenPosts() {
        //Given

        //When
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);

        calculations.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, calculations.getCommentPerPost());
    }

    @Test
    public void testingForLessCommentsThenPosts() {
        //Given

        //When
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1000);

        calculations.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0.1, calculations.getCommentPerPost());
    }

    @Test
    public void testingForZeroPosts() {
        //Given
        List<String> list = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            list.add("user" + n);
        }

        //When
        when(statisticsMock.usersNames()).thenReturn(list);

        calculations.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculations.getPostPerUser());
    }

    @Test
    public void testingForThousandPosts() {
        //Given
        List<String> list = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            list.add("user" + n);
        }

        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(list);

        calculations.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, calculations.getPostPerUser());
    }

    @Test
    public void testingShowingStatistics() {
        //Given
        List<String> list = new ArrayList<>();
        for (int n = 0; n < 78; n++) {
            list.add("user" + n);
        }

        //When
        when(statisticsMock.postsCount()).thenReturn(245);
        when(statisticsMock.commentsCount()).thenReturn(1148);
        when(statisticsMock.usersNames()).thenReturn(list);

        calculations.calculateAdvStatistics(statisticsMock);

        String statistics = calculations.showStatistics();
        System.out.println(statistics);

        //Then
        assertEquals("User count= 78\n" +
                "Post count= 245\n" +
                "Comment count= 1148\n" +
                "Post per user= 3.141025641025641\n" +
                "Comment per user= 14.717948717948717\n" +
                "Comment per post= 4.685714285714286", calculations.showStatistics());
    }
}
