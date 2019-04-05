/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_viettuts;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Minh Thinh
 */
public class StudentManager {

    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private final StudentDAO studentDAO;

    /**
     * initiate StudentDAO object and read list student when initiate
     * StudentManager object
     */
    public StudentManager() {
        studentDAO = new StudentDAO();
        studentList = studentDAO.read();
    }

    /**
     * add student to studentList
     */
    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        float gpa = inputGpa();
        Student student = new Student(id, name, age, address, gpa);
        studentList.add(student);
        studentDAO.write(studentList);
    }

    /**
     * edit student by id
     *
     * @param id
     */
    public void edit(int id) {
        boolean isExisted = false;
        for (Student student : studentList) {
            if (student.getId() == id) {
                isExisted = true;
                student.setName(inputName());
                student.setAge(inputAge());
                student.setAddress(inputAddress());
                student.setGpa(inputGpa());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            studentDAO.write(studentList);
        }
    }

    /**
     * delete student by id
     *
     * @param id: student id
     */
    public void delete(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                studentDAO.write(studentList);
                break;
            } else {
                System.out.printf("id = %d not existed.\n", id);
            }
        }
    }

    /**
     * sort student by name
     */
    public void sortStudentByName() {
        Collections.sort(studentList, new SortStudentByName());
    }

    /**
     * sort student by id
     */
    public void sortStudentByGPA() {
        Collections.sort(studentList, new SortStudentByGPA());
    }

    /**
     * show list student to screen
     */
    public void show() {
        for (Student student : studentList) {
            System.out.format("%5d | ", student.getId());
            System.out.format("%20s | ", student.getName());
            System.out.format("%5d | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f%n", student.getGpa());
        }
    }

    /**
     * input student id
     *
     * @return student id
     */
    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    /**
     * input student name
     *
     * @return student name
     */
    private String inputName() {
        System.out.print("Input student name: ");
        return scanner.nextLine();
    }

    /**
     * input student address
     *
     * @return student address
     */
    private String inputAddress() {
        System.out.print("Input student address: ");
        return scanner.nextLine();
    }

    /**
     * input student age
     *
     * @return student age
     */
    private byte inputAge() {
        System.out.print("Input student age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

    /**
     * input student GPA
     *
     * @return GPA
     */
    private float inputGpa() {
        System.out.print("Input student gpa: ");
        while (true) {
            try {
                float gpa = Float.parseFloat((scanner.nextLine()));
                if (gpa < 0.0 && gpa > 10.0) {
                    throw new NumberFormatException();
                }
                return gpa;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }

    // Getter && Setter
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

}
