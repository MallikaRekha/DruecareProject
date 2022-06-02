package io.javabrains.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.model.Books;
import io.javabrains.service.BooksService;

//mark class as Controller  
@RestController  
public class BooksController   
{  
//autowired the BooksService class  
@Autowired  
private BooksService booksService;  
//creating a get mapping that retrieves all the books detail from the database   
@GetMapping("/book")  
public List<Books> getAllBooks(){
	
return booksService.getAllBooks();  
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/books/{bookid}")  
public Books getBooks(@PathVariable("bookid") int bookid)   
{  
return booksService.getBooksById(bookid);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/books/{bookid}")  
public void deleteBook(@PathVariable("bookid") int bookid)   
{  
booksService.delete(bookid);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/books")  
public Books saveBook(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books;  
}  
//creating put mapping that updates the book detail   
@PutMapping("/books")  
public Books update(@RequestBody Books books)   
{  
booksService.saveOrUpdate(books);  
return books;  
}  
}  