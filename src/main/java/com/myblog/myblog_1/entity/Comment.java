package com.myblog.myblog_1.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String text;

    private String email;

    // Many comments can be associated with one post
    @ManyToOne
    @JoinColumn(name = "post_id") //foreign key column
    private Post post;

    // Constructors, getters, and setters
}
