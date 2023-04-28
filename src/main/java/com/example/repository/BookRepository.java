package com.example.repository;

import com.example.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends MongoRepository<Book, String>{
    public List<Book> findBookByProperties(String name,String author,String email, String phone);
}
