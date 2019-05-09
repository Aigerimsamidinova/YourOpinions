package com.example.projectXX.repository;

import com.example.projectXX.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRep  extends JpaRepository<Comment, Long> {
}
