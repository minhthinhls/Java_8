package geometric_objects;

import java.util.Date;

public class TestGeometricObject {

    public static void main(String[] args) {
        Date date = new Date();
        Rectangle rec = new Rectangle("red", true, date, 5.5, 9.5);
        Circle cir = new Circle("blue", true, date, 3.0);
        System.out.println("Rectangle created date: " + rec.getDateCreated().toString());
        System.out.println("Circle radius: " + cir.getRadius());
    }
}
