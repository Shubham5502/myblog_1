package com.myblog.myblog_1.service;

import com.myblog.myblog_1.payload.CommentDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface CommentService {
    CommentDto createComment(CommentDto commentDto,long postId);
}
