package com.example.projectXX.controller;

import com.example.projectXX.model.Category;
import com.example.projectXX.model.Response;
import com.example.projectXX.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CrudService<Category> categoryCrudService;

    @GetMapping(path = "/getAll", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<Category> getAll() {
        return categoryCrudService.getAll();
    }

    @GetMapping(path = "/get/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response getById(@PathVariable Long id) {
        try {
            return new Response("Category by id = " + id, true, categoryCrudService.findById(id));
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

    @PostMapping(path = "/add", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response add(@RequestBody Category category) {
        try {
            return new Response("Successfully created", true, categoryCrudService.save(category));
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

    @PutMapping(path = "/update", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    private Response update(Category category) {
        try {
            return new Response("Updated", true, categoryCrudService.update(category));
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

    @DeleteMapping(path = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response deleteById(@PathVariable Long id) {
        try {
            categoryCrudService.deleteById(id);
            return new Response("Deleted category by id = " + id, true, null);
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

    @DeleteMapping(path = "/deleteAll", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    private Response deleteAll() {
        try {
            categoryCrudService.deleteAll();
            return new Response("Deleted all categories", true, null);
        } catch (Exception e) {
            return new Response(e.toString(), false, null);
        }
    }

}
