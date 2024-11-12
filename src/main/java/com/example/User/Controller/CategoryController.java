package com.example.User.Controller;

import com.example.User.Models.Category;
import com.example.User.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/category")



public class CategoryController {


    @Autowired
    public CategoryService service;

    @GetMapping
    public List<Category> get() {
        return service.getAll();
    }

    @PostMapping
    public String saveAll(@RequestBody Category category) {
        return service.insert(category);
    }

    @DeleteMapping("/{id}")
    public String deleted(@PathVariable long id) {
        return service.deletesAll(id);
    }
}