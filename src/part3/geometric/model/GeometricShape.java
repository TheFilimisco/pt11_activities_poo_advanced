package part3.geometric.model;

public abstract class GeometricShape {
    final private int idGeometric;

    protected GeometricShape(int idGeometric) {
        this.idGeometric = idGeometric;
    }

    public int getIdGeometric() {
        return idGeometric;
    }

    @Override
    public String toString() {
        return "GeometricShape{" +
                "idGeometric=" + idGeometric +
                '}';
    }
}
