package com.kromero.beans.configs;

import com.kromero.beans.models.ClassRoom;
import com.kromero.beans.models.Instructor;
import com.kromero.beans.models.Instructors;
import com.kromero.beans.models.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.ArrayList;

@Configuration
public class ClassroomConfig {



    @Bean
    @DependsOn({"instructors","students"})
    public ClassRoom currentCohort(@Qualifier("students") Students students, Instructors instructors){
        return new ClassRoom(instructors,students);
    }

    @Bean
    @DependsOn({"instructors","prevStudents"})
    public ClassRoom prevCohort(@Qualifier("prevStudents") Students students, Instructors instructors){
        return new ClassRoom(instructors,students);
    }


}
