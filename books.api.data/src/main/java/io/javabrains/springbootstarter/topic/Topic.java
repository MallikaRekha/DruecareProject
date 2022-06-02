package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Topic {
	@Id
	private String id;
	private String bookname;
	private String author;
	private String price;
	public Topic() {
	}
	
	
	public Topic(String id, String bookname, String author,String price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.price=price;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return bookname;
	}
	public void setName(String name) {
		this.bookname = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void getauthor(String author) {
		this.author = author;
	}
	public String getprice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}
