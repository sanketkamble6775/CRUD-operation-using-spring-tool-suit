package com.javatpoint.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javatpoint.model.Books;
import com.javatpoint.repository.BooksRepository;

//defining logic
@Service
public class BooksService 
{
	
@Autowired
BooksRepository booksRepository;

//getting all the record by using the findaAll() method of CrudRepository
public List<Books> getAllBooks() 
{
List<Books> books = new ArrayList<Books>();
booksRepository.findAll().forEach(books1 -> books.add(books1));
return books;
}


//getting a specific record by using the findById() method of CrudRepository
public Books getBooksById(int id) 
{
return booksRepository.findById(id).get();
}


//saving a specific record by using the save() method of CrudRepository
public void saveOrUpdate(Books books) 
{
booksRepository.save(books);
}


//deleting a specific record by using the deleteById() method of CrudRepository
public void delete(int id) 
{
booksRepository.deleteById(id);
}


//updating a record
public void update(Books books, int bookid) 
{
booksRepository.save(books);
}
}