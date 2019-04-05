/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Minh Thinh
 */
public class Student {

    private String id;
    private String name;
    private String address;
    private int age;
    private float gpa;

    /**
     *
     * @param id
     * @param name
     * @param address
     * @param age
     * @param gpa
     */
    public Student(String id, String name, String address, int age, float gpa) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
        this.gpa = gpa;
    }

    public List getAllFields() {
        List<String> fields = new ArrayList<>();
        fields.add(id);
        fields.add(name);
        fields.add(address);
        fields.add(String.valueOf(age));
        fields.add(String.valueOf(gpa));
        return fields;
    }

    /**
     *
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public float getGpa() {
        return gpa;
    }

    /**
     *
     * @param gpa
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

}
