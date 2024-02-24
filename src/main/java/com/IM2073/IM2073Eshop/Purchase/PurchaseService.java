package com.IM2073.IM2073Eshop.Purchase;

import com.IM2073.IM2073Eshop.Product.Product;
import com.IM2073.IM2073Eshop.Product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;



    public Purchase addPurchase(Purchase purchase){
        return purchaseRepository.save(purchase);
    }

    public List<Purchase> allPurchases(){
        return purchaseRepository.findAll();
    }
}
