package com.nghia.application.service;

import com.nghia.application.entity.Comment;
import com.nghia.application.model.request.CreateCommentPostRequest;
import com.nghia.application.model.request.CreateCommentProductRequest;
import org.springframework.stereotype.Service;

@Service
public interface CommentService {
    Comment createCommentPost(CreateCommentPostRequest createCommentPostRequest,long userId);
    Comment createCommentProduct(CreateCommentProductRequest createCommentProductRequest, long userId);
}
