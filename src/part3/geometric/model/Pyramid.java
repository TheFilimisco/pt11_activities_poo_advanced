package part3.geometric.model;

public class Pyramid extends Shape3D {
    private float baseLength;
    private float baseWidth;
    private float height;

    public Pyramid(int idGeometric, float baseLength, float baseWidth, float height) {
        super(idGeometric);
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    public float getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    public float getBaseWidth() {
        return baseWidth;
    }

    public void setBaseWidth(float baseWidth) {
        this.baseWidth = baseWidth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float getVolume() {
        return (baseLength*baseWidth*height)/3;
    }

    @Override
    public float getArea() {
        return baseLength * baseWidth;
    }

    @Override
    public float getPerimeter() {
        return 2 * (baseLength+baseWidth);
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "baseLength=" + baseLength +
                ", baseWidth=" + baseWidth +
                ", height=" + height +
                "} " + super.toString();
    }

}
