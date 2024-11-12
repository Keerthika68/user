package com.example.User.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate createdon;
    @OneToMany(mappedBy = "cart",cascade = CascadeType.ALL)
    @JsonManagedReference(value = "cart-cartItem")
    private List<CartItem> cartItems;
    @ManyToMany(mappedBy = "cart")
    @JsonIgnoreProperties("Cart")
    private Set<Orders> orders;
    @OneToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    private User users;

    public User getUsers() {
        return users;
    }

    public void setUsers(User users) {
        this.users = users;
    }

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

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
}
