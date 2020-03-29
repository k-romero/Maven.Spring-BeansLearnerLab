package com.kromero.beans.configs;

import com.kromero.beans.models.ClassRoom;
import com.kromero.beans.models.Student;
import com.kromero.beans.models.Students;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class StudentConfig {


    @Bean(name ="students")
    public Students currentStudents(){
        ArrayList<Student> curr = new ArrayList<>(10);
        for(int i = 0; i < 10; i++) {
            Long id = Long.valueOf(i);
            curr.add(new Student(id,"cS"+i));
        }
        return new Students(curr);
    }


    @Bean(name = "prevStudents")
    public Students prevStudents(){
        ArrayList<Student> prev = new ArrayList<>(15);
        for(int i = 0; i < 15; i++) {
            Long id = Long.valueOf(i);
            prev.add(new Student(id,"pS"+i));
        }
        return new Students(prev);
    }
}
