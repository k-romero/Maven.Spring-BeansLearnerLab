package com.kromero.beans.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{

    ArrayList<PersonType> personList;

    public People(ArrayList<PersonType> personList) {
        this.personList = personList;
    }

    public void addPerson(PersonType personType){
        personList.add(personType);
    }

    public void removePerson(PersonType personType){
        personList.remove(personType);
    }

    public Integer getSize(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> people){
        people.forEach(p -> personList.add(p));
    }


    public PersonType findById(Long id){
        for (PersonType p : personList) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }

    public ArrayList<PersonType> findAll(){
        return personList;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        personList.forEach(p -> {
            builder.append( "\nModel " + p.getName());
        });
        return builder.toString();
    }
}
