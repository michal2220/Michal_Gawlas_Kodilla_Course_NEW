package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeworkTest {

    @Test
    public void testUpdate() {
        // Given
        Homework javaCourse = new JavaCourse();
        Homework pythonCourse = new PythonCourse();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor ivoneEscobar = new Mentor("Ivone Escobar");
        Mentor jessiePinkman = new Mentor("Jessie Pinkman");
        javaCourse.registerObserver(johnSmith);
        javaCourse.registerObserver(ivoneEscobar);
        pythonCourse.registerObserver(jessiePinkman);
        javaCourse.registerObserver(jessiePinkman);
        // When
        javaCourse.addTask("Task 1");
        javaCourse.addTask("Task 2");
        javaCourse.addTask("Task 3");
        javaCourse.addTask("Task 4");
        pythonCourse.addTask("Task 1");
        pythonCourse.addTask("Task 2");
        // Then
        assertEquals(4, johnSmith.getUpdateCount());
        assertEquals(4, ivoneEscobar.getUpdateCount());
        assertEquals(6, jessiePinkman.getUpdateCount());
    }

}