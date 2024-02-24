package com.IM2073.IM2073Eshop.Product;

import com.IM2073.IM2073Eshop.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;



    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> allProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(int productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
    }


}
