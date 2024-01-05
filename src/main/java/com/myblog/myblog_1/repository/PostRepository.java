package com.myblog.myblog_1.repository;

import com.myblog.myblog_1.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
