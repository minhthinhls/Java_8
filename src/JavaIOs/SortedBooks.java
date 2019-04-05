/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIOs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Minh Thinh
 */
public class SortedBooks {

    Set<Book> SortedBooks;

    public SortedBooks() {
        SortedBooks = new TreeSet<>((book1, book2) -> {
            double year_1 = Double.parseDouble(book1.getPublish_year());
            double year_2 = Double.parseDouble(book2.getPublish_year());
            if (year_1 == year_2) {
                return 1;
            } else {
                return Double.valueOf(year_1).compareTo(year_2);
            }
        });
    }

    public void readFrom(String fromUrl) {
        try {
            FileReader fr = new FileReader(fromUrl);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String[] fields;
            while ((line = br.readLine()) != null) {
                fields = line.split(", ");
                SortedBooks.add(new Book(fields));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeTo(String toUrl) {
        try {
            FileWriter fw = new FileWriter(toUrl);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Object object : SortedBooks) {
                if (object instanceof Book) {
                    bw.write(String.join(", ", ((Book) object).getAllFields()));
                } else {
                    throw new ClassCastException("Error casting from Objects to Books in the Collection");
                }
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayInfo() {
        Field[] fields = Book.class.getDeclaredFields();
        List<String> listField = Stream.of(fields).map(x -> "*" + x.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(String.format("%-25s%-25s%-25s%-25s", listField.toArray()));

        for (Object object : SortedBooks) {
            String line = String.format("%-25s%-25s%-25s%-5s $", ((Book) object).getAllFields().toArray());
            System.out.println(line);
        }
    }

}
