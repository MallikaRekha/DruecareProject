package io.javabrains.springbootstarter.book;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Book {
	@Id
	private String id;
	private String bookname;
	private String author;
	private String price;
	
	@ManyToOne
	private Topic topic;
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	public Book() {
	}
	
	public Book(String id, String bookname, String author, String price,String topicId) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.price=price;
		this.topic=new Topic(topicId,"","","");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getbookName() {
		return bookname;
	}
	public void setbookName(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}
}
