package com.example.User.Controller;

import com.example.User.Models.Products;
import com.example.User.Repository.ProductsRepository;
import com.example.User.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    public ProductService service;
    @GetMapping
    public List<Products> getAll(){
        return service.getAll();
    }
    @PostMapping
    public String insert(@RequestBody Products products){
        return service.insert(products);
    }
    @DeleteMapping("/{id}")
    public String deleted(@PathVariable long id ){
        return service.deleted(id);
    }
}
