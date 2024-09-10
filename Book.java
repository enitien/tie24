/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Book {

    public static Scanner sc = new Scanner(System.in);

    private String BookID;
    private String title;
    private Author author;

    public Book(String BookID, String title, Author author) {
        this.BookID = BookID;
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "BookID=" + BookID + ", title=" + title + ", author=" + author + '}';
    }

    public void inputBook() {
 this.author = new Author();
        System.out.println("Enter book ID: ");
        this.BookID = sc.nextLine();
        System.out.println("Enter title: ");
        this.title = sc.nextLine();

        System.out.println("Enter author's name: ");
        String authorName = sc.nextLine();
        System.out.println("Enter author's ID: ");
        String authorID = sc.nextLine();
        this.author.setAuthorID(authorID);
        this.author.setName(authorName);
        System.out.println("Enter author's date: ");
        String date1 = sc.nextLine();
        SimpleDateFormat date2 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date3 = date2.parse(date1);
            this.author.setDateOfBirth(date3);

        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        
       
    }

    public void displayBook() {
        System.out.println("Book ID: " + this.getBookID());
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author ID: " + this.author.getAuthorID());
        System.out.println("Author Name: " + this.author.getName());
        System.out.println("Author Date of Birth: " + this.author.getDateOfBirth());
    }
}
