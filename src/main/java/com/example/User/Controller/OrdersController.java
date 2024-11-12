package com.example.User.Controller;

import com.example.User.Models.Orders;
import com.example.User.Service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    public OrdersService service;
    @GetMapping
    public List<Orders> get(){
        return service.getAll();
    }
    @PostMapping
    public String saveAll(@RequestBody Orders orders){
        return service.insert(orders);
    }
    @DeleteMapping("/{id}")
    public String deleted(@PathVariable long id){
        return service.deleted(id);
    }

}
