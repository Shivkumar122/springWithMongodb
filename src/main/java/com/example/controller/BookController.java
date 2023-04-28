package com.example.controller;

import com.example.model.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/save")
    public ResponseEntity<Book> saveStudent(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.CREATED);
    }

    @GetMapping("/getbooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBook();
    }

    @GetMapping("/getById/{id}")
    public Book getById(@PathVariable String id) {
        return bookService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id) {
        bookService.deleteById(id);
    }

    @GetMapping("/getByName")
    public List<Book> getByName(@PathVariable  String name,String author,String email, String phone){
        return bookService.getByName(name,author,email, phone);
    }
}

