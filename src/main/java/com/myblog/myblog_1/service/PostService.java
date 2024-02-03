package com.myblog.myblog_1.service;

import com.myblog.myblog_1.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
   PostDto getPostById(long id);
    List<PostDto> getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}
