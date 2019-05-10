package com.example.projectXX.repository;

import com.example.projectXX.model.Commentary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentaryRep extends JpaRepository<Commentary, Long> {
}
