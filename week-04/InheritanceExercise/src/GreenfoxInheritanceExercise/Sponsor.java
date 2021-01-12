package GreenfoxInheritanceExercise;

public class Sponsor extends Person {
    private String company;
    private Integer hiredStudents = 0;

    public Sponsor(String name, Integer age, String gender, String company){
        super(name, age, gender);
        this.company = company;
    }

    public Sponsor(){
        this("Jane Doe", 30, "female", "Google");
    }

    @Override
    public void introduce(){
        System.out.println(super.commonIntroduce() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire(){
        this.hiredStudents++;
    }

    @Override
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }


}
