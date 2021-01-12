package GreenfoxInheritanceExercise;

import java.util.ArrayList;
import java.util.List;

public class Mentor extends Person {
    private String level;

    /* public String setIntermediateLevel(){
        List<String> level = new ArrayList<>();
        level.add("junior");
        level.add("intermediate");
        level.add("senior");

        return level.get(1);
    } */


    public Mentor(String name, Integer age, String gender,String level){
        super(name, age, gender);
        this.level = level;
    }

    public Mentor(){
        this("Jane Doe", 30, "female", "intermediate");
    }

    @Override
    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

     @Override
    public void introduce(){
        System.out.println(super.commonIntroduce() + level + " mentor ");
    }
}

