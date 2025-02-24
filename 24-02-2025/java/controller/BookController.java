package controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import entities.Book;
import services.BookService;

@RestController("chava")
public class BookController {

//	@GetMapping("/books")
//	public Book getBooks( ) {
//		
//		Book book = new Book();
//		book.setId(1234);
//		book.setTitle("Java complete Reference");
//		book.setAuthor("XYZ");
//		return book;
//	}
//	@GetMapping("/c")
//	public String ujjwal() {
//		return "ujjwal";
//	}
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/us")
	public List<Book> getBooks(){
		return this.bookService.getAllBooks();
	}
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id)
	{
		return bookService.getBookById(id);
	}
}
