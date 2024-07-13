package com.roxiler.task.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.OffsetDateTime;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private double price;
    private String description;
    private String category;
    private String image;
    private boolean sold;
    private OffsetDateTime dateOfSale;  // Changed to OffsetDateTime

    // Default constructor
    public Product() {}

    // Parameterized constructor
    public Product(String title, double price, String description, String category, String image, boolean sold, OffsetDateTime dateOfSale) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.sold = sold;
        this.dateOfSale = dateOfSale;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public OffsetDateTime getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(OffsetDateTime dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
}
