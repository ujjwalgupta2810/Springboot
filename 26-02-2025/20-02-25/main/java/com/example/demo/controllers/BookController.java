
package com.example.demo.controllers;

import com.example.demo.entities.Book;
import com.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    //    // Endpoint for retrieving all books
    @GetMapping("/books")
    public List<Book> getBooks() {
        return this.bookService.getAllBooks();
    }
//


    //  @GetMapping("/books")
//    public ResponseEntity<List<Book>> getBooks() {
//        List<Book> list = bookService.getAllBooks();
//        if(list.size() <= 0) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        return ResponseEntity.of(Optional.of(list));
//        }
//    }
//    // Endpoint for retrieving a book by ID
//    @GetMapping("/books/{id}")
//    public Book getBookById(@PathVariable("id") Integer id) {
//        return bookService.getBookById(id);
//    }
//}
    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") Integer id) {
        Book book = bookService.getBookById(id);
        if (book == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();


        } else {
            return ResponseEntity.of(Optional.of(book));
        }
    }


    //
//@PostMapping("/books")
//public Book addBook(@RequestBody Book book) {
//    Book b = this.bookService.addBook(book);
//    return b;
//}
    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book b = null;
        try{
            b = this.bookService.addBook(book);
            System.out.println(book);
            return ResponseEntity.of(Optional.of(b));
        }
        catch(Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
//// delete book handler
//    @DeleteMapping("/books/{bookId}")
//    public void deleteBook(@PathVariable ("bookId") int bookId)
//    {
//        this.bookService.deleteBook(bookId);
//    }
//    //update book handler
// @PutMapping ("/books/{bookId}")
//    public Book  updateBook(@RequestBody Book book ,@PathVariable("bookId") int bookId)
//    {
//        this.bookService.updateBook(book,bookId);
//        return book;
//    }
////
//    @GetMapping("/test")
//    public String handleRequestHeader(@RequestHeader String authorization){
//
//        System.out.println("printing the header"+ authorization);
//        return "Success";
//    }


