package com.example.User.Controller;

import com.example.User.Models.User;
import com.example.User.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService service;
    @GetMapping
    public List<User> get(){
        return service.getAll();
    }
    @PostMapping
    public String saveAll(@RequestBody User user){
        return service.insert(user);
    }
    @DeleteMapping("/{id}")
    public String deleted(@PathVariable long id){
        return service.deletesAll(id);
    }
}
