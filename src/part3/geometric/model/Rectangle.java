package part3.geometric.model;

public class Rectangle extends Shape2D{
    private float sideX;
    private float sideY;

    public Rectangle(int idGeometric, float sideX, float sideY) {
        super(idGeometric);
        this.sideX = sideX;
        this.sideY = sideY;
    }

    public float getSideX() {
        return sideX;
    }

    public void setSideX(float sideX) {
        this.sideX = sideX;
    }

    public float getSideY() {
        return sideY;
    }

    public void setSideY(float sideY) {
        this.sideY = sideY;
    }

    @Override
    public float getArea() {
        return sideX * sideY;
    }

    @Override
    public float getPerimeter() {
        return 2 * (sideX + sideY);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideX=" + sideX +
                ", sideY=" + sideY +
                "} " + super.toString();
    }
}
