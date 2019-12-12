package com.serverApiCreation.springBoot.bootstrap;

import com.serverApiCreation.springBoot.domain.Product;
import com.serverApiCreation.springBoot.repository.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = LogManager.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product first = new Product();
        first.setName("First product");
        first.setPrice(new BigDecimal("20.05"));
        first.setCode(1234567890);
        first.setExpirationDate("02/05/2020");
        first.setAvailabilityDate("01/01/2020");
        productRepository.save(first);

        log.info("Saved first product - id: " + first.getId());
    }
}
