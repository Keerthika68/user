package com.example.User.Service;

import com.example.User.Models.User;
import com.example.User.Models.Userrole;
import com.example.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {
    @Autowired
    public UserRepository repository;
    public List<User> getAll(){
       return repository.findAll();
    }
    public String insert(User user){
        user.setCreatedon(LocalDate.now());
        user.setUserrole(Userrole.ADMIN);
        repository.save(user);
        return "saved..";

    }
    public String deletesAll(long id){
        repository.deleteById(id);
        return "deleted..";
    }
}
