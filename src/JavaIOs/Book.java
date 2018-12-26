/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIOs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Thinh
 */
public class Book {

    private String information;
    private String title;
    private String publish_year;
    private String price;

    public Book(String[] books_field) {
        this.information = books_field[0];
        this.title = books_field[1];
        this.publish_year = books_field[2];
        this.price = books_field[3];
    }

    public Book(String information, String title, String publish_year, String price) {
        this.information = information;
        this.title = title;
        this.publish_year = publish_year;
        this.price = price;
    }

    public List getAllFields() {
        List<String> fields = new ArrayList<>();
        fields.add(information);
        fields.add(title);
        fields.add(publish_year);
        fields.add(price);
        return fields;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublish_year() {
        return publish_year;
    }

    public void setPublish_year(String publish_year) {
        this.publish_year = publish_year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
