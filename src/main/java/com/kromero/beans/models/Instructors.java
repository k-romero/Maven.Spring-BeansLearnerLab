package com.kromero.beans.models;

import java.util.ArrayList;
import java.util.Iterator;

public class Instructors extends People<Instructor>{


    public Instructors(ArrayList<Instructor> personList) {
        super(personList);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
