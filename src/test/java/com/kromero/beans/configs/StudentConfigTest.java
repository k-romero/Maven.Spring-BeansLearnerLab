package com.kromero.beans.configs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentConfigTest {
    Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    StudentConfig config;


    @Test
    void currentStudents() {
        logger.log(Level.INFO,config.currentStudents().toString());
        assertEquals(10,config.currentStudents().getSize());
    }

    @Test
    void prevStudents() {
        logger.log(Level.INFO,config.prevStudents().toString());
        assertEquals(15,config.prevStudents().getSize());
    }
}