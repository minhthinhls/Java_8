package rectangle;

import java.util.Date;

public class Circle extends GeometricObject {

    private double radius;

    public Circle(String color, boolean filled, Date dateCreated, double radius) {
        super(color, filled, dateCreated);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

}
