package StudentTeacher;

public class Teacher {

    public void answer() {
        System.out.println("I'm answering a question.");
    }

    public void teach(Student student) {
        student.learn();
    }
}
