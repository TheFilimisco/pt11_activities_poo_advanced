package part1.employees.model;

public class CommercialEmployee extends Employee{
    private double commission = 0;

    public CommercialEmployee(String name, int age, double salary) {
        super(name, age, salary);
    }

    public double getCommission() {
        return commission;
    }

    public void updateCommission(double commission) {
        this.commission += commission;
    }

    @Override
    public String toString() {
        return "CommercialEmployee{" +
                "commission=" + commission +
                "} " + super.toString();
    }
}
