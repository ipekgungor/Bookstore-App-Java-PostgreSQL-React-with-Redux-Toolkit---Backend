package com.example.bookstoreapp.Controller;

import com.example.bookstoreapp.Model.Book;
import com.example.bookstoreapp.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins = "http://localhost:3000")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Optional<Book> book = bookRepository.findById(id); //it's type can be book or not
        if (book.isPresent()) {
            return ResponseEntity.ok(book.get()); //status code:200 and return book object
        } else {
            return ResponseEntity.notFound().build(); //status code:404
        }
    }

}
