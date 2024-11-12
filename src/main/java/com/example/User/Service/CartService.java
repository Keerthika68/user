package com.example.User.Service;

import com.example.User.Models.Cart;
import com.example.User.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CartService {
    @Autowired
    public CartRepository repository;
    public List<Cart> getAll(){
        return repository.findAll();

    }
    public String insert(Cart cart){
        cart.setCreatedon(LocalDate.now());
        repository.save(cart);
        return "saved...";
    }
    public String deleted(long id){
        repository.deleteById(id);
        return "deleted...";
    }
}
