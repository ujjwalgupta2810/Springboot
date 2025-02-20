package com.example.crud;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.books.Books;
import com.example.service.BooksService;

@RestController
@RequestMapping("/book")  // Add a base mapping here
public class BooksController {

    @Autowired
    BooksService booksService;

    // Get all books
    @GetMapping
    private List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    // Get a book by ID
    @GetMapping("/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid) {
        return booksService.getBooksById(bookid);
    }

    // Delete a book by ID
    @DeleteMapping("/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid) {
        booksService.delete(bookid);
    }

    // Create a new book
    @PostMapping
    private int saveBook(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books.getBookid();
    }

    // Update an existing book
    @PutMapping
    private Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }
}
