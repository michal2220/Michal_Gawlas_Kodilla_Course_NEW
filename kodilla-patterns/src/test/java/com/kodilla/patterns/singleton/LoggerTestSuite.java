package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void logTest() {

        //Given
        Logger logger = Logger.INSTANCE;

        //When
        logger.log("new log 1");
        String testLog = logger.getLastLog();

        //Then
        assertEquals("new log 1", testLog);
    }
}
