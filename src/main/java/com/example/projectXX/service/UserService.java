package com.example.projectXX.service;

import com.example.projectXX.model.Comment;

import java.util.List;

public interface UserService {
    List<Comment> getLikeComments(Long id);
    List<Comment> getUserComments(Long id);
}
