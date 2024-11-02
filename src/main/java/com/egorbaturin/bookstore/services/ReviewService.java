package com.egorbaturin.bookstore.services;

import com.egorbaturin.bookstore.entity.Book;
import com.egorbaturin.bookstore.entity.Review;
import com.egorbaturin.bookstore.entity.User;
import com.egorbaturin.bookstore.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public List<Review> findAll() {
        return reviewRepository.findAll();
    }

    public List<Review> findByBook(Book book) {
        return reviewRepository.findByBook(book);
    }

    public List<Review> findByUser(User user) {
        return reviewRepository.findByUser(user);
    }

    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteById(Long id) {
        reviewRepository.deleteById(id);
    }
}
