/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIOs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Minh Thinh
 */
public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Set<Book> SortedBooks = new TreeSet<>((book1, book2) -> {
            double year_1 = Double.parseDouble(book1.getPublish_year());
            double year_2 = Double.parseDouble(book2.getPublish_year());
            if (year_1 == year_2) {
                return 1;
            } else {
                return Double.valueOf(year_1).compareTo(year_2);
            }
        });

        try {
            FileReader fr = new FileReader("D:\\books.txt");
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

        System.out.println(String.format("%-25s%-25s%-25s%-25s", "*Information:", "*Title:", "*Publish year:", "*Price:"));
        for (Book book : SortedBooks) {
            String line = String.format("%-25s%-25s%-25s%-25s", book.getInformation(), book.getTitle(), book.getPublish_year(), book.getPrice() + " $");
            System.out.println(line);
        }

        try {
            FileWriter fw = new FileWriter("D:\\books_writing.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for (Book book : SortedBooks) {
                //bw.write(book.getInformation() + ", " + book.getTitle() + ", " + book.getPublish_year() + ", " + book.getPrice());
                bw.write(String.join(", ", book.getAllFields()));
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
