package com.example.User.Controller;

import com.example.User.Models.Address;
import com.example.User.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/address")

public class AddressController {


    @Autowired
    public AddressService service;

    @GetMapping
    public List<Address> get() {
        return service.getAll();
    }

    @PostMapping
    public String saveAll(@RequestBody Address address) {
        return service.insert(address);
    }

    @DeleteMapping("/{id}")
    public String deleted(@PathVariable long id) {
        return service.deletesAll(id);
    }
}
