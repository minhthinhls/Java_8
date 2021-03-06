package hash_map;

public class Student {//implements Comparable<Student> {

    int id;
    String name;
    int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public int getRollno() {
        return id;
    }

    public void setRollno(int rollno) {
        this.id = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student(" + name + ", " + age + ")";
    }

}
