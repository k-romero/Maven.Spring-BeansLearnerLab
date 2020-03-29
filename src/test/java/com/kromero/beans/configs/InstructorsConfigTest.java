package com.kromero.beans.configs;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class InstructorsConfigTest {
    Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    InstructorsConfig config;

    @Test
    void tcUsaInstructors() {
        logger.log(Level.INFO,config.tcUsaInstructors().toString());
        assertEquals(12,config.tcUsaInstructors().getSize());
    }

    @Test
    void tcUkInstructors() {
        logger.log(Level.INFO,config.tcUkInstructors().toString());
        assertEquals(11,config.tcUkInstructors().getSize());
    }

    @Test
    void tcZCInstructors() {
        logger.log(Level.INFO,config.tcZCInstructors().toString());
        assertEquals(5,config.tcZCInstructors().getSize());
    }
}