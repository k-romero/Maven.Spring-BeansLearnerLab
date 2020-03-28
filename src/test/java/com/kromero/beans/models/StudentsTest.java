package com.kromero.beans.models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    Students students;

    @BeforeEach
    void setUp() {
        ArrayList<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Long id = Long.valueOf(i);
            studentList.add(new Student(id,"s"+i));
        }
        students = new Students(studentList);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void iterator() {
        assertTrue(students.iterator() instanceof Iterator);
    }

    @Test
    void sizeTest(){
        assertEquals(5,students.getSize());
    }

    @Test
    void addTest(){
        students.addPerson(new Student(6L,"newStudent"));
        assertEquals(6,students.getSize());
    }

    @Test
    void clearTest(){
        students.clear();
        assertEquals(0,students.getSize());
    }

    @Test
    void removeTest(){
        students.removePerson(students.findById(1L));
        assertEquals(4,students.getSize());
    }

    @Test
    void findAll(){
        ArrayList<Student> test = students.findAll();
        assertEquals(5,test.size());
    }
}