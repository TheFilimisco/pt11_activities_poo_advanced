package part1.geometric.model;

public class ObjectGeometric {
    private double coord_x;
    private double coord_y;
    private String color;

    public ObjectGeometric(double coord_x, double coord_y, String color) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
        this.color = color;
    }

    @Override
    public String toString() {
        return "ObjectGeometric{" +
                "coord_x=" + coord_x +
                ", coord_y=" + coord_y +
                ", color='" + color + '\'' +
                '}';
    }
}
