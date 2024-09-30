package com.example.bookstoreapp.Repository;

import com.example.bookstoreapp.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {	
}