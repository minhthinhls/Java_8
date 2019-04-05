/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management;

import JavaIOs.Book;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Minh Thinh
 */
public class StudentHandler {

    public Set<Student> sorted_students = new TreeSet();
    public Map<String, Student> students = new HashMap();

    /**
     *
     */
    public StudentHandler() {

    }

    /**
     *
     * @param students
     */
    public StudentHandler(Map<String, Student> students) {
        this.students = students;
    }

    public void add(Student student) {
        this.students.put(student.getId(), student);
    }

    public void edit(String id, String name, String address, int age, float gpa) {
        Student edited = new Student(id, name, address, age, gpa);
        this.students.put(edited.getId(), edited);
    }

    public void delete(String deleted) {
        //this.sorted_students.remove(this.students.get(deleted));
        this.students.remove(deleted);
    }

    public void sort_by_name() {
        Set<Student> SortedStudents = new TreeSet<>((student1, student2) -> {
            String name_1 = student1.getName();
            String name_2 = student2.getName();
            if (name_1.equals(name_2)) {
                return 1;
            } else {
                return String.valueOf(name_1).compareTo(name_2);
            }
        });
        SortedStudents.addAll((Collection<? extends Student>) this.students.values());
        this.sorted_students = SortedStudents;
    }

    public void sort_by_gpa() {
        Set<Student> SortedStudents = new TreeSet<>((student1, student2) -> {
            float gpa_1 = student1.getGpa();
            float gpa_2 = student2.getGpa();
            if (gpa_1 == gpa_2) {
                return 1;
            } else {
                return Float.valueOf(gpa_1).compareTo(gpa_2);
            }
        });
        SortedStudents.addAll((Collection<? extends Student>) this.students.values());
        this.sorted_students = SortedStudents;
    }

    public void show() {
        Field[] fields = Student.class.getDeclaredFields();
        List<String> listField = Stream.of(fields).map(x -> "*" + x.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(String.format("%-20s%-30s%-20s%-15s%-15s", listField.toArray()));

        if (!sorted_students.isEmpty()) {
            for (Object object : sorted_students) {
                String line = String.format("%-20s%-30s%-20s%-15s%-15s", ((Student) object).getAllFields().toArray());
                System.out.println(line);
            }
        } else {
            for (Object object : students.values()) {
                String line = String.format("%-20s%-30s%-20s%-15s%-15s", ((Student) object).getAllFields().toArray());
                System.out.println(line);
            }
        }
    }

}
