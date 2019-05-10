package com.example.projectXX.controller;

import com.example.projectXX.model.Comment;
import com.example.projectXX.model.Response;
import com.example.projectXX.model.User;
import com.example.projectXX.service.CrudService;
import com.example.projectXX.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
   private CrudService<User>userCrudService;
    @Autowired
    private UserService userService;
    
    @GetMapping(path = "/getAll", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<User> getAll() {
        return userCrudService.getAll();
    }
    @GetMapping("/{id}/comments")
    private List<Comment> getUserComments(@PathVariable Long id){
        return userService.getUserComments(id);
    }

    @GetMapping(path = "/get/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response getById(@PathVariable Long id) {
        try {
            return new Response("User by id = " + id, true, userCrudService.findById(id));
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

    @PostMapping(path = "/add", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response add(@RequestBody User user) {
        try {
            return new Response("Successfully created", true, userCrudService.save(user));
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

    @PutMapping(path = "/update", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    private Response update(User user) {
        try {
            return new Response("Updated", true, userCrudService.update(user));
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

    @DeleteMapping(path = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response deleteById(@PathVariable Long id) {
        try {
            userCrudService.deleteById(id);
            return new Response("Deleted user by id = " + id, true, null);
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

    @DeleteMapping(path = "/deleteAll", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    private Response deleteAll() {
        try {
            userCrudService.deleteAll();
            return new Response("Deleted all items", true, null);
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }



}
