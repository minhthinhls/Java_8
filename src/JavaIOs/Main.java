/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIOs;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Minh Thinh
 */
public class Main {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        SortedBooks books = new SortedBooks();

        books.readFrom("D://books.txt");
        books.displayInfo();
        books.writeTo("D://books_writing.txt");
    }
}
