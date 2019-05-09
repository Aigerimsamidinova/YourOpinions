package com.example.projectXX.bootstrap;

import com.example.projectXX.model.User;
import com.example.projectXX.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserBootstrap implements CommandLineRunner {
    @Autowired
    private CrudService<User>userCrudService;
    @Override
    public void run(String... args) throws Exception {
        User user=new User.Builder().withEmail("serikovastik@gmail.com").withName("Astik").withPassword("123").build();
        System.out.println(user);
        userCrudService.save(user);



    }
}
