//package com.example.projectXX.controller;
//
//import com.example.projectXX.model.Commentary;
//import com.example.projectXX.model.Response;
//import com.example.projectXX.service.CrudService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/comment")
//public class CommentaryController {
//    @Autowired
//    private CrudService<Commentary> crudService;
//
//    @PostMapping(path = "/add", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    public Response add(@RequestBody Commentary c){
//        try {
//            return new Response("Successfully created", true, crudService.add(c));
//        }
//        catch (Exception e){
//            return new Response(e.getMessage(), false, null);
//        }
//    }
//
//    @GetMapping(path = "/getAll", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    public Response getAll(){
//        try {
//            return new Response("All comments: ", true, crudService.getAll());
//        }
//        catch (Exception e){
//            return new Response(e.getMessage(), false, null);
//        }
//    }
//
//    @GetMapping(path = "/get/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    public Response getById(@PathVariable Long id){
//        try{
//            return new Response("Comment by id: " + id, true, crudService.findById(id));
//        }
//        catch (Exception e){
//            return new Response(e.getMessage(), false, null);
//        }
//    }
//
//    @DeleteMapping(path = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    public Response deleted(@PathVariable Long id){
//        crudService.deleteById(id);
//        try {
//            return new Response("Deleted comment by id: " + id, true, null);
//        }
//        catch (Exception e){
//            return new Response(e.getMessage(), false, null);
//        }
//    }
//}
