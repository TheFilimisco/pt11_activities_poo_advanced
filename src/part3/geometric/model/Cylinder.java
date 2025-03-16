package part3.geometric.model;

public class Cylinder extends Shape3D implements IConstant{
    private float radius;
    private float height;

    public Cylinder(int idGeometric, float radius, float height) {
        super(idGeometric);
        this.radius = radius;
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (float) (IConstant.PI*(Math.sqrt(radius)) * height);
    }

    @Override
    public float getArea() {
        return (float) ((2*IConstant.PI*(Math.sqrt(radius))) + (2*IConstant.PI*radius*height));
    }

    @Override
    public float getPerimeter() {
        return 2*IConstant.PI*radius;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                "} " + super.toString();
    }
}
