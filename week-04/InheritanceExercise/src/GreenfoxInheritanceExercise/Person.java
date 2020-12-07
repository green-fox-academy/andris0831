package GreenfoxInheritanceExercise;

public class Person {
    private String name;
    private Integer age;
    private String gender;

    public Person(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    public String commonIntroduce(){
        return "Hi I'm " + name + " a " + age + " year old " + gender;
    }

    public void introduce(){
        System.out.println(commonIntroduce());
    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }



}
