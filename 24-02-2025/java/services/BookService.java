package services;
import java.util.ArrayList;


import java.util.List;

import org.springframework.stereotype.Component;

import controller.BookController;

import entities.Book;

@Component
public class BookService {

	private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(12, "Java Complete Reference","XYZ"));
		list.add(new Book(13, "Unix","Aditysa"));
		list.add(new Book(12, "adress","abc"));

	}
	public List<Book> getAllBooks()
	{
		return list;
	}
	//get single book by id
	public Book getBookById(int id)
	{
		Book book = null;
	book =	list.stream().filter(e->e.getId()==id).findFirst().get();
	return book;
	
	}
}
