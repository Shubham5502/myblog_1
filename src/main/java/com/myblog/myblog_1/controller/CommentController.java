package com.myblog.myblog_1.controller;

import com.myblog.myblog_1.payload.CommentDto;
import com.myblog.myblog_1.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

      private CommentService commentService;

      public CommentController(CommentService commentService) {
            this.commentService = commentService;
      }

      @PostMapping
      public ResponseEntity<CommentDto> createComment(
              @RequestBody CommentDto commentDto,
              @RequestParam long postId   //Query Parameter
      ){
            CommentDto dto = commentService.createComment(commentDto, postId);
            return new ResponseEntity<>(dto, HttpStatus.CREATED);
      }

}
