package com.example.User.Service;

import com.example.User.Models.Orders;
import com.example.User.Models.Products;
import com.example.User.Repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OrdersService {
    @Autowired
    public OrdersRepository repository;
    public List<Orders> getAll(){
        return repository.findAll();
    }
    public String insert(Orders orders){
        orders.setCreatedon(LocalDate.now());
        repository.save(orders);
        return "saved...";
    }
    public String deleted(long id){
        repository.deleteById(id);
        return "deleted...";
    }
}
