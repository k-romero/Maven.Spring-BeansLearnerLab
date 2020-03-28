package com.kromero.beans.models;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student oscar;

    @BeforeEach
    void setUp() {
    oscar = new Student(1L,"Oscar");
    oscar.learn(10.0);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getTotalStudyTime() {
        assertEquals(10.0,oscar.getTotalStudyTime());
    }

    @Test
    void learn() {
        oscar.learn(10.0);
        assertEquals(20.0,oscar.getTotalStudyTime());
    }

    @Test
    void setName(){
        oscar.setName("Kevin");
        assertEquals("Kevin",oscar.getName());
    }
}