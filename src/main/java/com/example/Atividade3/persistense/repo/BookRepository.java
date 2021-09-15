package com.example.Atividade3.persistense.repo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

import com.example.Atividade3.persistense.model.Book;

@ComponentScan({"com.delivery.request"})
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}