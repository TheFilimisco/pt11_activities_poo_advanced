package part1.school.model;

import java.util.HashSet;

public class Teacher extends Person{
    private HashSet<String> subjects;

    public Teacher(String name, String address) {
        super(name, address);
        subjects = new HashSet<>();
    }

    public boolean addSubject(String subject){
        return subjects.add(subject);
    }

    public boolean removeSubject(String subject){
        return subjects.remove(subject);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subjects=" + subjects +
                "} " + super.toString();
    }
}
