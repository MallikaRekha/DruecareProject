package io.javabrains.model;

import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

//mark class as an Entity
@Entity
public class Books {  

 @Id
private int bookid; 

private String bookname;

private String author;

private int price;
public Books() {
	
}
public Books(int bookid, String bookname, String author,int price) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.author = author;
	this.price=price;
}
public int getBookid()   
{  
return bookid;  
}  
public void setBookid(int bookid)   
{  
this.bookid = bookid;  
}  
public String getBookname()  
{  
return bookname;  
}  
public void setBookname(String bookname)   
{  
this.bookname = bookname;  
}  
public String getAuthor()   
{  
return author;  
}  
public void setAuthor(String author)   
{  
this.author = author;  
}  
public int getPrice()   
{  
return price;  
}  
public void setPrice(int price)   
{  
this.price = price;  
}  
}  
