package hash_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static void printMap(String state, Map<String, Student> map) {
        System.out.println("\n*The " + state + " HashMap: ");
        map.entrySet().stream().forEach((item) -> {
            System.out.println(item.getKey() + " -> " + item.getValue());
        });
    }

    static void putNewStudentIn(String key, String name, int age, Map<String, Student> map) {
        System.out.println("\n*Put new student into existed key: ");
        map.put(key, new Student(name, age));
        System.out.println(key + " -> " + map.get(key));
    }

    static void findStudentIn(Map<String, Student> map) {
        String key;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("\nInput the key: ");
            key = scanner.nextLine().toLowerCase();
        }
        System.out.println(key + " -> " + map.get(key));
    }

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        map.put("a1111", new Student("Tuan", 18));
        map.put("a1112", new Student("Toan", 21));
        map.put("a1113", new Student("Binh", 19));
        map.put("a1114", new Student("Hao", 18));
        map.put("a1115", new Student("Hung", 20));

        printMap("initial", map);
        putNewStudentIn("a1113", "Dung", 22, map);
        printMap("modified", map);
        findStudentIn(map);

    }
}
