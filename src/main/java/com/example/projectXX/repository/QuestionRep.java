package com.example.projectXX.repository;

import com.example.projectXX.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRep extends JpaRepository<Question, Long> {
}
