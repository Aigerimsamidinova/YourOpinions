package com.example.projectXX.service;

import com.example.projectXX.model.Category;
import com.example.projectXX.repository.CategoryRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServicelmpl implements CrudService<Category> {
    @Autowired
    private CategoryRep categoryRep;

    @Override
    public List<Category> getAll() {
        return categoryRep.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRep.findById(id).get();
    }

    @Override
    public Category save(Category category) {
        return categoryRep.save(category);
    }

    @Override
    public Category update(Category category) {
        return categoryRep.save(category);
    }

    @Override
    public void deleteById(Long id) {
        categoryRep.deleteById(id);
    }

    @Override
    public void deleteAll() {
        categoryRep.deleteAll();
    }
}