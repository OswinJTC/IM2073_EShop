package com.IM2073.IM2073Eshop.Purchase;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PURCHASE")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "CUSTOMER")
    private String customer;

    @Column(name = "QTY")
    private String qty;

    @Column(name = "Total")
    private int total;

    @Column(name = "TIME")
    private String created;



}
