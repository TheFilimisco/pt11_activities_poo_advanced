package part3.geometric.model;

public class Circle extends Shape2D implements IConstant{
    private float radius;

    public Circle(int idGeometric, float radius) {
        super(idGeometric);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (IConstant.PI * Math.sqrt(radius));
    }

    @Override
    public float getPerimeter() {
        return 2 * IConstant.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
