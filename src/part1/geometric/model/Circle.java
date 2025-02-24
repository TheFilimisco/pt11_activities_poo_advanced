package part1.geometric.model;

public class Circle extends ObjectGeometric{
    private double radius;

    public Circle(double coord_x, double coord_y, String color, double radius) {
        super(coord_x, coord_y, color);
        this.radius = radius;
    }

    public double perimeter(){
        return 2 * Math.PI*radius;
    }

    public double area(){
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
