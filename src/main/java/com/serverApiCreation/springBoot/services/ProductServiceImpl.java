package com.serverApiCreation.springBoot.services;

import com.serverApiCreation.springBoot.domain.Product;
import com.serverApiCreation.springBoot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> ListOfProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    /*@Override
    public List<Product> searchProducts(String name, BigDecimal price, Long code) {
        return productRepository.searchProducts(name, price, code);
    }*/

}
