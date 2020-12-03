package StudentTeacher;

public class Student {


    public void learn() {
        System.out.println("I'm learning something new.");
    }

    public void question(Teacher teacher) {
        teacher.answer();
    }

}
