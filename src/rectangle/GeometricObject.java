package rectangle;

import java.util.Date;

public class GeometricObject {

    private String color;
    private boolean filled;
    private java.util.Date dateCreated;

    protected GeometricObject() {
    }

    public GeometricObject(String color, boolean filled, Date dateCreated) {
        //super();
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        String result = null;
        return result;
    }

    public double getArea() {
        double kq = 0;
        return kq;
    }

    public double getPerimeter() {
        double kq = 0;
        return kq;
    }

}
