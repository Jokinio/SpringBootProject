package com.serverApiCreation.springBoot.repository;

import com.serverApiCreation.springBoot.domain.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

   /* @Query("SELECT * FROM Product WHERE (Product.name = :lastName) AND (Product.price = :price) AND (Product.code = :code) order by price")
    List<Product> searchProducts(@Param("name") String name, @Param("price") BigDecimal price, @Param("code") Long code);*/
}
