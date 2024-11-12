package com.example.User.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    private String price;
    private String stock;
    private LocalDate createdon;
    @ManyToOne
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    @JsonBackReference(value = "category-products")
    private Category category;
    @ManyToMany
    @JoinTable(
            name = "Products_CartItem",
            joinColumns = @JoinColumn (name = "Products_id"),
            inverseJoinColumns = @JoinColumn(name = "CartItem_id")

    )
@JsonIgnoreProperties("Products")
    private Set<CartItem> cartItem;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public LocalDate getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDate createdon) {
        this.createdon = createdon;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<CartItem> getCartItem() {
        return cartItem;
    }

    public void setCartItem(Set<CartItem> cartItem) {
        this.cartItem = cartItem;
    }

}
