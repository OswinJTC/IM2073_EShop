package com.IM2073.IM2073Eshop.Product;

import com.IM2073.IM2073Eshop.Review.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "PRODUCT")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "ITEM")
    private String item;

    @Column(name = "PRICE")
    private int price;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMAGE_PATH")
    private String imagePath; // Store the path of the image file

    // Constructors, getters, and setters
}
