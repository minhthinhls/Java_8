package geometric_objects;

import java.util.Date;

public class Rectangle extends GeometricObject {

    private double width;
    private double height;

    public Rectangle(String color, boolean filled, Date dateCreated, double width, double height) {
        super(color, filled, dateCreated);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
