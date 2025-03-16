package part3.geometric.model;

public abstract class Shape2D extends GeometricShape implements ICalculate2D{
    protected Shape2D(int idGeometric) {
        super(idGeometric);
    }

    @Override
    public abstract float getArea();

    @Override
    public abstract float getPerimeter();

}
