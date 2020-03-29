package com.kromero.beans.configs;

import com.kromero.beans.models.Instructor;
import com.kromero.beans.models.Instructors;
import com.kromero.beans.models.Student;
import com.kromero.beans.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors(){
        ArrayList<Instructor> curr = new ArrayList<>(10);
        for(int i = 0; i < 10; i++) {
            Long id = Long.valueOf(i);
            curr.add(new Instructor(id,"tUsa"+i));
        }
        return new Instructors(curr);
    }

    @Bean
    public Instructors tcUkInstructors(){
        ArrayList<Instructor> curr = new ArrayList<>(10);
        for(int i = 0; i < 10; i++) {
            Long id = Long.valueOf(i);
            curr.add(new Instructor(id,"tUk"+i));
        }
        return new Instructors(curr);
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors tcZCInstructors(){
        ArrayList<Instructor> curr = new ArrayList<>(10);
        for(int i = 0; i < 10; i++) {
            Long id = Long.valueOf(i);
            curr.add(new Instructor(id,"tZC"+i));
        }
        return new Instructors(curr);
    }
}
