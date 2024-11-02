package com.egorbaturin.bookstore.repositories;

import com.egorbaturin.bookstore.entity.Book;
import com.egorbaturin.bookstore.entity.Review;
import com.egorbaturin.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByBook(Book book);
    List<Review> findByUser(User user);
}
