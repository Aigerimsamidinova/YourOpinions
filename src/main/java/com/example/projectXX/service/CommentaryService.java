package com.example.projectXX.service;

import com.example.projectXX.model.Commentary;
import com.example.projectXX.repository.CommentaryRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaryService implements CrudService<Commentary> {
    @Autowired
    private CommentaryRep commentaryRep;

    @Override
    public List<Commentary> getAll() {
        return commentaryRep.findAll();
    }

    @Override
    public Commentary findById(Long id) {
        return commentaryRep.findById(id).get();
    }

    @Override
    public Commentary add(Commentary commentary) {
        return commentaryRep.save(commentary);
    }

    @Override
    public Commentary update(Commentary commentary) {
        return commentaryRep.save(commentary);
    }

    @Override
    public void deleteById(Long id) {
        commentaryRep.deleteById(id);
    }

    @Override
    public void deleteAll() {

    }
}
