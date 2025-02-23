package part1.school.model;

public class InternationalStudent extends Student{
    private String country;

    public InternationalStudent(String name, String address, String cycle, int course, String country) {
        super(name, address, cycle, course);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "InternationalStudent{" +
                "country='" + country + '\'' +
                "} " + super.toString();
    }
}
