package com.example.User.Service;

import com.example.User.Models.CartItem;
import com.example.User.Repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CartItemService {
    @Autowired
    public CartItemRepository repository;
    public List<CartItem> getAll(){
        return repository.findAll();
    }
    public String insert(CartItem cartItem){
        cartItem.setCreatedon(LocalDate.now());
        repository.save(cartItem);
        return "saved...";

    }
    public String deleted(long id){
        repository.deleteById(id);
        return "deleted..";
    }
}
