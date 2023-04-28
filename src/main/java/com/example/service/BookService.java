package com.example.service;

import com.example.model.Book;

import java.util.List;

public interface BookService {
    public Book saveBook(Book book);
    public List<Book> getAllBook();
    public Book getById(String id);
    public void deleteById(String id);
    public List<Book> getByName(String name,String author,String email, String phone);
}
