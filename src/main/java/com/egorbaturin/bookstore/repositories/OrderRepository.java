package com.egorbaturin.bookstore.repositories;

import com.egorbaturin.bookstore.entity.Order;
import com.egorbaturin.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUser(User user);
}
