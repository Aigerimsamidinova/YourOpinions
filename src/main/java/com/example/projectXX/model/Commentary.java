package com.example.projectXX.model;

import com.example.projectXX.enums.Mark;

import javax.persistence.*;
import java.util.List;

@Entity
public class Commentary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;

    @ManyToMany
    @JoinTable(name = "comment_question", joinColumns = @JoinColumn(name = "comment_id"),
            inverseJoinColumns = @JoinColumn (name = "question_id"))
    private List<Question> question;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Mark mark;

    public Commentary() {
    }

    public Commentary(String comment, User user) {
        this.comment = comment;
        this.user = user;
    }

    public Commentary(String comment, List<Question> question, User user, Mark mark) {
        this.comment = comment;
        this.question = question;
        this.user = user;
        this.mark = mark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Question> getQuestion() {
        return question;
    }

    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
}
