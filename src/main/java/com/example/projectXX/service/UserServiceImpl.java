package com.example.projectXX.service;


import com.example.projectXX.enums.Mark;

import com.example.projectXX.model.User;
import com.example.projectXX.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements CrudService<User> {
    @Autowired
    private UserRep userRep;

//    @Autowired
//    private UserService userService;

    @Override
    public List<User> getAll() {
        return userRep.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRep.findById(id).get();
    }

    @Override
    public User save(User user) {
        return userRep.save(user);
    }

    @Override
    public User update(User user) {
        return userRep.save(user);
    }

    @Override
    public void deleteById(Long id) {
        userRep.deleteById(id);
    }

    @Override
    public void deleteAll() {
        userRep.deleteAll();
    }

//    @Override
//    public List<Comment> getUserComments(Long id) {
//        return userRep.getUserComments(id,Arrays.asList(Mark.DISLIKE,Mark.LIKE));
//    }

//    @Override
//    public List<Comment> getLikeComments(Long id) {
//        return userRep.getLikeComments(id, Collections.singletonList(Mark.LIKE));
//    }
//    Collections.singletonList(Mark.LIKE))

//    @Override
//    public List<Comment> getLikeComments(Long id) {
//        return null;
//    }
}
