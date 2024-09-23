package Lektion9.associationerAggregat;

public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course){
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }
    void studentCourse(){
        System.out.println(course.getName());
    }
}
