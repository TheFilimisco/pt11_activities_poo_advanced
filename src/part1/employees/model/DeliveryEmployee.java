package part1.employees.model;

public class DeliveryEmployee extends Employee {
    private String areaDelivery;

    public DeliveryEmployee(String name, int age, double salary, String areaDelivery) {
        super(name, age, salary);
        this.areaDelivery = areaDelivery;
    }

    public String getAreaDelivery() {
        return areaDelivery;
    }

    public void setAreaDelivery(String areaDelivery) {
        this.areaDelivery = areaDelivery;
    }

    @Override
    public String toString() {
        return "DeliveryEmployee{" +
                "areaDelivery='" + areaDelivery + '\'' +
                "} " + super.toString();
    }
}
