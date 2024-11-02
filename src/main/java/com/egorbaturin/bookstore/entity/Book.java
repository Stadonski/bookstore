package com.egorbaturin.bookstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;


@Entity
@Table(name = "Books")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(nullable = false, length = 100)
    private String title;

    @ManyToOne(optional = true)
    @JoinColumn(name = "author_id", referencedColumnName = "author_id", onDelete = OnDelete.CASCADE)
    private Author author;

    @ManyToOne(optional = true)
    @JoinColumn(name = "genre_id", referencedColumnName = "genre_id", onDelete = OnDelete.CASCADE)
    private Genre genre;

    @Column
    private Integer publishedYear;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer stock;
}
