package com.example.service;

import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.BooksRepository;  
import com.example.books.*;

@Service  
public class BooksService {  

    @Autowired  
    BooksRepository booksRepository;  

    // Retrieve all books
    public List<Books> getAllBooks() {  
        List<Books> books = new ArrayList<>();  
        booksRepository.findAll().forEach(books1 -> books.add(books1));  
        return books;  
    }  

    // Get a specific book by ID
    public Books getBooksById(int id) {  
        return booksRepository.findById(id).orElse(null);  // Optional handling to avoid exceptions
    }  

    // Save or update a book
    public void saveOrUpdate(Books books) {  
        booksRepository.save(books);  
    }  

    // Delete a specific book by ID
    public void delete(int id) {  
        booksRepository.deleteById(id);  
    }  

    // Update a book (same as saveOrUpdate in this case)
    public void update(Books books) {  
        booksRepository.save(books);  
    }  
}
