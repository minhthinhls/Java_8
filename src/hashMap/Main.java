package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<String, Student>();
        map.put("a1111", new Student("Tuan", 18));
        map.put("a1112", new Student("Toan", 21));
        map.put("a1113", new Student("Binh", 19));
        map.put("a1114", new Student("Hao", 18));
        map.put("a1115", new Student("Hung", 20));

        System.out.println("The initial HashMap: ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("\nPut new student into existed key: ");
        map.put("a1113", new Student("Dung", 22));
        System.out.println("a1113 " + map.get("a1113"));

        System.out.println("\nThe modified HashMap: ");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap key: ");
        String key = scanner.nextLine().toLowerCase();
        scanner.close();
        System.out.println(key + " " + map.get(key));

    }
}
