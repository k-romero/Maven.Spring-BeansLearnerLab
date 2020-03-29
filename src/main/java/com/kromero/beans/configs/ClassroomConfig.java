package com.kromero.beans.configs;

import com.kromero.beans.models.ClassRoom;
import com.kromero.beans.models.Instructor;
import com.kromero.beans.models.Instructors;
import com.kromero.beans.models.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;


@Configuration
public class ClassroomConfig {

    @Bean(name = "currentCohort")
    @DependsOn({"instructors","students"})
    @Primary
    public ClassRoom currentCohort(Instructors instructors, @Qualifier("students") Students students){
        return new ClassRoom(instructors,students);
    }

    @Bean(name = "prevCohort")
    @DependsOn({"tcInstructors","prevStudents"})
    public ClassRoom prevCohort(@Qualifier("prevStudents") Students students,@Qualifier("tcInstructors") Instructors instructors){
        return new ClassRoom(instructors,students);
    }


}
