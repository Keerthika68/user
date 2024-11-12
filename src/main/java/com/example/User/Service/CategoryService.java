package com.example.User.Service;

import com.example.User.Models.Address;
import com.example.User.Models.Category;
import com.example.User.Repository.AddressRepository;
import com.example.User.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class CategoryService {
    @Autowired
    public CategoryRepository repository;
    public List<Category> getAll(){
        return repository.findAll();
    }
    public String insert(Category category){
        category.setCreatedon(LocalDate.now());
        repository.save(category);
        return "saved..";

    }
    public String deletesAll(long id){
        repository.deleteById(id);
        return "deleted..";
    }

}


