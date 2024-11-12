package com.example.User.Controller;

import com.example.User.Models.CartItem;
import com.example.User.Service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cartitem")
public class CartItemController {
    @Autowired
    public CartItemService service;
    @GetMapping
    public List<CartItem> get(){
        return service.getAll();
    }
    @PostMapping
    public String saveAll(@RequestBody CartItem cartItem){
        return service.insert(cartItem);
    }
    @DeleteMapping("/{id}")
    public String deleted(@PathVariable long id){
        return service.deleted(id);
    }
}
