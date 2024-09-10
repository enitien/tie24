/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        System.out.println("Enter the number of books:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the newline

        for (int i = 0; i < size; i++) {
            Book book = new Book();
            System.out.println("Enter book: " + (i+1));
            book.inputBook();
            books.add(book);
        }

        for (Book book : books) {
            int i = 0;
            System.out.println("book: " + (i+1));
            book.displayBook();
            i++;
        }
        
        sc.close();
    }
    
}
