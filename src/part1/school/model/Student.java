package part1.school.model;

public class Student extends Person {
    private String cycle;
    private int course;

    public Student(String name, String address, String cycle, int course) {
        super(name, address);
        this.cycle = cycle;
        this.course = course;
    }

    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "cycle='" + cycle + '\'' +
                ", course=" + course +
                "} " + super.toString();
    }
}
