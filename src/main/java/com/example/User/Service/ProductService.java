package com.example.User.Service;

import com.example.User.Models.Products;
import com.example.User.Repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    public ProductsRepository repository;
    public List<Products> getAll(){
        return repository.findAll();
    }
    public String insert(Products products){
        products.setCreatedon(LocalDate.now());
        repository.save(products);
        return "savede...";
    }
    public String deleted(long id){
        repository.deleteById(id);
        return "deleted..";
    }







}
