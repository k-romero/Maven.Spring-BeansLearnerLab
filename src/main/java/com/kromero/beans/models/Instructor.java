package com.kromero.beans.models;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Instructor extends  Person implements Teacher{

    private Double hoursWorked;


    public Instructor(Long id, String name) {
        super(id, name);
        this.hoursWorked = 0.0;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void teach(Learner learner, Double numOfHrs) {
        learner.learn(numOfHrs);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numOfHrs) {
        Double hrsPer = numOfHrs/((ArrayList<Learner>) learners).size();
        learners.forEach(l -> l.learn(hrsPer));
        hoursWorked += numOfHrs;
    }
}
