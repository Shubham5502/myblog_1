package com.myblog.myblog_1.repository;

import com.myblog.myblog_1.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
