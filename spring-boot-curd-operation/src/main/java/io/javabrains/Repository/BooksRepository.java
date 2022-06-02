package io.javabrains.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import io.javabrains.model.Books;


//repository that extends CrudRepository  
public interface BooksRepository extends CrudRepository<Books, Integer>  
{
	public List<Books> findById(int Id);
}  