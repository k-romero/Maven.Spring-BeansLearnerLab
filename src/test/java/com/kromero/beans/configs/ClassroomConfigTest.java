package com.kromero.beans.configs;

import com.kromero.beans.models.ClassRoom;
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
class ClassroomConfigTest {
    Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    ClassroomConfig config;

    @Autowired
    InstructorsConfig instructors;

    @Autowired
    StudentConfig students;

    @Test
    void currentCohort() {
        ClassRoom test = config.currentCohort(instructors.tcZCInstructors(),students.currentStudents());
        logger.log(Level.INFO,test.toString());
        assertEquals(5,test.getInstructors().getSize());
        assertEquals(10,test.getStudents().getSize());
    }

    @Test
    void prevCohort() {
        ClassRoom test2 = config.prevCohort(students.prevStudents(), instructors.tcUkInstructors());
        logger.log(Level.INFO,test2.toString());
        assertEquals(11,test2.getInstructors().getSize());
        assertEquals(15,test2.getStudents().getSize());
    }
}