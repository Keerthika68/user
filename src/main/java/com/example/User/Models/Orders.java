package com.example.User.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate createdon;
    @ManyToMany
    @JoinTable(
            name="Orders_Address",
            joinColumns = @JoinColumn(name = "Orders_id"),
            inverseJoinColumns = @JoinColumn(name="Address_id")
    )
    @JsonIgnoreProperties("Orders")
    private Set<Address> address;
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    @JsonBackReference(value = "user-order")
    private User user;
    @ManyToMany
    @JoinTable(
           name="Orders_Cart",
           joinColumns = @JoinColumn(name = "Orders_id"),
            inverseJoinColumns = @JoinColumn(name = "Cart_id")

    )
    @JsonIgnoreProperties("Orders")
    private Set<Cart> cart;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDate createdon) {
        this.createdon = createdon;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Cart> getCart() {
        return cart;
    }

    public void setCart(Set<Cart> cart) {
        this.cart = cart;
    }


}
