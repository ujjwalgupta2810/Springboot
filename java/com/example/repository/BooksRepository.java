package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.books.Books;  // Make sure to import the Books class

// Repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer> {
  // You can define custom query methods here if needed
}
