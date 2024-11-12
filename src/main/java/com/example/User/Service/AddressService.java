package com.example.User.Service;

import com.example.User.Models.Address;
import com.example.User.Models.Addresstype;
import com.example.User.Models.User;
import com.example.User.Repository.AddressRepository;
import com.example.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class AddressService {
    @Autowired
    public AddressRepository repository;
    public List<Address> getAll(){
        return repository.findAll();
    }
    public String insert(Address address){
        address.setCreatedon(LocalDate.now());
        address.setAddresstype(Addresstype.HOME);
        repository.save(address);
        return "saved..";

    }
    public String deletesAll(long id){
        repository.deleteById(id);
        return "deleted..";
    }

}
