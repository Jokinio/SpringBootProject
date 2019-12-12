package com.serverApiCreation.springBoot.services;

import com.serverApiCreation.springBoot.domain.Product;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {

    Iterable<Product> ListOfProducts();

    Product insertProduct(Product product);

    void deleteProduct(Integer id);

   /* List<Product> searchProducts(String name, BigDecimal price, Long code);*/

}
