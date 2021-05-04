package third.week.assignment;

public class Main {
    public static void main(String[] args) {
        // SOLID
        User student = new User();
        student.setUsername("busra");
        student.setPassword("123456");

        User instructor = new User();
        instructor.setUsername("engin");
        instructor.setPassword("qwerty");

        StudentManager studentManager = new StudentManager();
        studentManager.add(student);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
    }
}
