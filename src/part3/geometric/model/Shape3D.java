package part3.geometric.model;

public abstract class Shape3D extends GeometricShape implements ICalculate3D {

    protected Shape3D(int idGeometric) {
        super(idGeometric);
    }

    @Override
    public abstract float getVolume();

    @Override
    public abstract float getArea();

    @Override
    public abstract float getPerimeter();

}