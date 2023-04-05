package com.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.entity.Books;
import com.bookstore.reposetry.BookReposetry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookServices {
	
	@Autowired
	BookReposetry repo;

	//add Employee
	public Books addBook(Books book) {

			return repo.save(book);
	}
	
	//get All Employee
	public List<Books> getAllBooks(){
		return (List<Books>) repo.findAll();
	}
}