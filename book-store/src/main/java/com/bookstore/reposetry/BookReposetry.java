package com.bookstore.reposetry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Books;

@Repository
public interface BookReposetry extends JpaRepository<Books, Long>{

}
