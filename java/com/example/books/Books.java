package com.example.books;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Mark class as an Entity
@Entity  
// Define class name as Table name, add custom table name if needed
@Table(name = "books")  
public class Books {

    // Defining book id as primary key
    @Id
    @Column(name = "bookid")
    private int bookid;

    @Column(name = "bookname")
    private String bookname;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    private int price;

    // Default constructor (required by JPA)
    public Books() {}

    // Parameterized constructor for easy object creation
    public Books(int bookid, String bookname, String author, int price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }

    // Getters and setters
    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
