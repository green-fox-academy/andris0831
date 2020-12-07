package GreenfoxInheritanceExercise;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    List<Student> students = new ArrayList<>();
    List<Mentor> mentors = new ArrayList<>();

    public Cohort(String name){
        this.name = name;
        this.students.clear();
        this.mentors.clear();

    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addMentor(Mentor mentor){
        this.mentors.add(mentor);
    }

    public void info(){
        System.out.println("The " + this.name + " has " + students.size() + " students and " + mentors.size() + " mentors.");
    }



}
