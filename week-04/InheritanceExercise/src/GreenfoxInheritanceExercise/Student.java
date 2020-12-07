package GreenfoxInheritanceExercise;

import GreenfoxInheritanceExercise.Person;

public class Student extends Person {
    private String previousOrganization;
    private Integer skippedDays;

    public Student(String name, Integer age, String gender, String previousOrganization){
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }

    public Student(){
        this("Jane Doe", 30, "female", "The School of Life");
        this.skippedDays = 0;
    }

    @Override
    public void getGoal(){
        System.out.println("Be a junior software developer.");
    }

    @Override
    public void introduce(){
        System.out.println(super.commonIntroduce() + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course.");
    }

    public void skipDays(Integer numberOfDays){
        this.skippedDays += numberOfDays;
    }





}
