package com.example.demo.services;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import com.example.demo.entities.Book;
import org.springframework.stereotype.Component;

@Component
public class BookService {

    private static List<Book> list=new ArrayList<>();

    static {
        list.add(new Book(12, "Java Complete Reference","XYZ"));
        list.add(new Book(13, "Unix","Aditysa"));
        list.add(new Book(12, "address","abc"));


    }
    public List<Book> getAllBooks()
    {
        return list;
    }
    //get single book by id
    public Book getBookById(int id)
    {
        Book book = null;
        try{
            book =	list.stream().filter(e->e.getId()==id).findFirst().get();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return book;

    }
    // adding the book
    public Book addBook(Book b)
    {
        list.add(b);
        return b;
    }
    //delete book
//    public void deleteBook(int bid){
//        list.stream().filter(book->{
//            if(book.getId()!=bid){
//                return true;
//            } else {
//                return false;
//            }
//        }).collect(Collectors.toList());
//    }
    public void deleteBook(int bid){
      list=  list.stream().filter(book->book.getId()!=bid).collect(Collectors.toList());
    }

// update the  book
public void updateBook(Book book, int bookId)
{
   list = list.stream().map(b->{
        if(b.getId()==bookId){
            b.setTitle(book.getTitle());
            b.setAuthor(book.getAuthor());
        }
        return b;
    }).collect(Collectors.toList());
}
}