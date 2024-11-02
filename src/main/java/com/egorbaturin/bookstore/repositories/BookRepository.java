package com.egorbaturin.bookstore.repositories;

import com.egorbaturin.bookstore.entity.Author;
import com.egorbaturin.bookstore.entity.Book;
import com.egorbaturin.bookstore.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor(Author author);
    List<Book> findByGenre(Genre genre);
}