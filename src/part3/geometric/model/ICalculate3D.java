package part3.geometric.model;

public interface ICalculate3D extends ICalculate2D {
    float getVolume();

    @Override
    float getArea();

    @Override
    float getPerimeter();
}
