package com.kromero.beans.models;

public class ClassRoom {

    Instructors instructors;
    Students students;

    public ClassRoom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public ClassRoom() {
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public void hostLecture(Teacher teacher,Double numOfHrs){
        teacher.lecture(students,numOfHrs);
    }


}
