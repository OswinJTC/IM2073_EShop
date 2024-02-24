package com.IM2073.IM2073Eshop.Purchase;


import com.IM2073.IM2073Eshop.Product.Product;
import com.IM2073.IM2073Eshop.Product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchaseApi")
@CrossOrigin(origins = "http://localhost:3000")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping("/allPurchases")
    public List<Purchase> findAllPurchases(){
        return purchaseService.allPurchases();
    }

    @PostMapping("/addPurchase")
    public ResponseEntity<Purchase> addAnPurchase(@RequestBody Purchase purchase){
        return new ResponseEntity<>(purchaseService.addPurchase(purchase), HttpStatus.CREATED);
    }
}
