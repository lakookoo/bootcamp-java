package shape;

public abstract class Shape {
    private double radius;

    public Shape(double radius){
        setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract double getArea();
    public abstract double getVolume();
}
