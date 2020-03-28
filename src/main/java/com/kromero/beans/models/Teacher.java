package com.kromero.beans.models;

public interface Teacher {

    public void teach(Learner learner, Double numOfHrs);

    public void lecture(Iterable<? extends Learner> learners, Double numOfHrs);


}

