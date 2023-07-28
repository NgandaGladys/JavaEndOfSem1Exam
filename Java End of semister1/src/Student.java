import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String grade;
    private List<Course> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    //method to add a course
    public void addCourse(Course course) {

        courses.add(course);
    }
    //method to remove the courses
}





