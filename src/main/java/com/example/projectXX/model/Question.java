package com.example.projectXX.model;

import com.example.projectXX.enums.Mark;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    @JoinColumn(name = "user_id")
    private User userId;
    private List<Comment> comments;
    @JoinColumn(name = "category_id")
    private Categories categoryId;
    private Mark mark;
    private Integer markCounter;

}
