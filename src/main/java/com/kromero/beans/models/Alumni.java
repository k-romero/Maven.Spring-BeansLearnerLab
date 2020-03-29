package com.kromero.beans.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("prevStudents")
    Students alum;

    @Autowired
    @Qualifier("instructors")
    Instructors instructors;


    @PostConstruct
    public void executeBootCamp(){
        double nmOfHours = 1200.0 * alum.findAll().size();
        double nmOfHoursPer = nmOfHours / instructors.findAll().size();
        instructors.forEach(i -> i.lecture(alum, nmOfHoursPer));
    }

    public Students getAlum() {
        return this.alum;
    }

    public Instructors getInstructors() {
        return this.instructors;
    }

}
