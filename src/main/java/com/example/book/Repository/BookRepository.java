package com.example.book.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.example.book.model.Book;


@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

}
