package com.bookstore.contrpller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.entity.Books;
import com.bookstore.services.BookServices;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@RestController
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookController {
	
	@Autowired
	BookServices service;
	
	@PostMapping("books")
	public ResponseEntity<Books> addBooks(@RequestBody Books book){
		
		return new ResponseEntity<> (service.addBook(book),HttpStatus.OK);
	}
	
	//Get All Employee
	@GetMapping("/books")
	public ResponseEntity<List<Books>> getAllEmployee(){
		return new ResponseEntity<> (service.getAllBooks(),HttpStatus.OK);
	}

}
