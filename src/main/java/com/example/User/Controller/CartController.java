package com.example.User.Controller;

import com.example.User.Models.Cart;
import com.example.User.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    public CartService service;
    @GetMapping
    public List<Cart> get(){
        return service.getAll();
    }
    @PostMapping
    public String SaveAll(@RequestBody Cart cart){
        return service.insert(cart);

    }
    @DeleteMapping("/{id}")
    public String deleted(@PathVariable long id){
        return service.deleted(id);
    }

}
