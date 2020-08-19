package com.example.mongodbconsumer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodbconsumer.model.BookClass;

public interface BookRepository extends MongoRepository<BookClass, String>{

}
