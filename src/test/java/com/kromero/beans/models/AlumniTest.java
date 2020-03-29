package com.kromero.beans.models;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AlumniTest {

    @Autowired
    Alumni alumni;

    @Test
    void executeBootCamp() {
        alumni.getAlum().findAll().forEach(a -> {
            assertEquals(1200.0,a.getTotalStudyTime());
        });
    }

    @Test
    void getAlum() {
        assertEquals(15,alumni.getAlum().getSize());
    }

    @Test
    void getInstructors() {
    }
}