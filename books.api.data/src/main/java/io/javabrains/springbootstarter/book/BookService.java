package io.javabrains.springbootstarter.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.topic.Topic;

@Service
public class BookService {
	
	@Autowired
	private BookRepository BookRepository;
	
	public List<Book> getAllBooks(String topicId){
		
		List<Book> books=new ArrayList<>();				
		BookRepository.findByTopicId(topicId)
		.forEach(books::add);
		return books;
		
	}
	public Book getBook(String id) {
		//return topicRepository.stream().filter(t-> t.findById(id).equals(id)).findFirst().get();
		return BookRepository.findById(id).get();
	}
	
	public void addBook(Book book) {
		BookRepository.save(book);
		
	}
	public void updateBook(Book book) {
		BookRepository.save(book);
				
			}		
	
	public void deletebook(String id) {
		//topics.removeIf(t->t.getId().equals(id));
		BookRepository.deleteById(id);
	}

}
