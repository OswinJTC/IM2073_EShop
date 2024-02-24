package com.IM2073.IM2073Eshop.Product;

import com.IM2073.IM2073Eshop.User.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findById(int id);

}
