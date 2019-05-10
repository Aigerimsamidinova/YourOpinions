package com.example.projectXX.service;

import com.example.projectXX.model.Question;
import com.example.projectXX.repository.QuestionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements CrudService<Question> {
    @Autowired
    private QuestionRep questionRep;

    @Override
    public List<Question> getAll() {
        return questionRep.findAll();
    }

    @Override
    public Question findById(Long id) {
        return findById(id);
    }

    @Override
    public Question add(Question question) {
        return questionRep.save(question);
    }

    @Override
    public Question update(Question question) {
        return questionRep.save(question);
    }

    @Override
    public void deleteById(Long id) {
        questionRep.deleteById(id);
    }

    @Override
    public void deleteAll() {
        questionRep.deleteAll();
    }
}
