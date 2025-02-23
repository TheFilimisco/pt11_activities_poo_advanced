package part1.school.test;

import part1.school.model.InternationalStudent;
import part1.school.model.Person;
import part1.school.model.Student;
import part1.school.model.Teacher;

public class TestSchool {
    public static void main(String[] args) {
        // Person
        Person person = new Person("Steven", "XDXDXDXD");
        System.out.println(person);
        //Student
        Student student = new Student("Felipe","XDXDXDXXD", "DAM", 5);
        System.out.println(student);
        //International Student
        InternationalStudent internationalStudent = new InternationalStudent("Manuel", "XDXDXDXD","DAM",4, "ECUADOR");
        System.out.println(internationalStudent);
        //Teacher
        Teacher teacher = new Teacher("Miguel", "XDXDXDXDXD");
        System.out.println(teacher.addSubject("ASISX"));
        System.out.println(teacher.addSubject("ASISX"));
        System.out.println(teacher.addSubject("SMIX"));
        System.out.println(teacher.addSubject("DAM"));
        System.out.println(teacher);
    }
}
