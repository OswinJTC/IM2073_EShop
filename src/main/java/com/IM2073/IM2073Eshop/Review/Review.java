package com.IM2073.IM2073Eshop.Review;

import com.IM2073.IM2073Eshop.Product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "REVIEW")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;


    @Column(name = "AUTHOR")
    private String author;


    @Column(name = "BODY")
    private String body;

    @Column(name = "PRODUCTID")
    private String product_id;

    @Column(name = "TIME")
    private String created;


}
