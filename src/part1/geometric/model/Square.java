package part1.geometric.model;

public class Square extends ObjectGeometric{
    private double side;
    private final int TOTAL_SIDE = 4;

    public Square(double coord_x, double coord_y, String color, double side) {
        super(coord_x, coord_y, color);
        this.side = side;
    }

    public double perimeter(){
        return TOTAL_SIDE * side;
    }

    public double area(){
        return Math.sqrt(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", TOTAL_SIDE=" + TOTAL_SIDE +
                "} " + super.toString();
    }
}
