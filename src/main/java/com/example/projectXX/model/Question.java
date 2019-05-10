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

    @OneToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @ManyToMany
    @JoinTable(name = "comment_question",
    joinColumns = @JoinColumn(name = "question_id"),
    inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<Commentary> comments;

    @OneToOne
    @JoinColumn(name = "category_id")
    private Categories categoryId;
    private Mark mark;
    private Integer markCounter;

}
