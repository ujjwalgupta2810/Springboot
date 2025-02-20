package com.example.get;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Book;

@RestController
public class BookController {

	@GetMapping("/books")
	public Book getBooks( ) {
		
		Book book = new Book();
		book.setId(1234);
		book.setTitle("Java complete Reference");
		book.setAuthor("XYZ");
		return book;
	}
	@GetMapping("/c")
	public String ujjwal() {
		return "ujjwal";
	}
}
