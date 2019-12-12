package com.serverApiCreation.springBoot.controllers;

import com.serverApiCreation.springBoot.domain.Product;

import com.serverApiCreation.springBoot.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;


@Controller
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String listOfProducts(Model model) {
        model.addAttribute("products", productService.ListOfProducts());
        return "products";
    }

    @RequestMapping("product/new")
    public String newProduct(Model model) {
        model.addAttribute("product", new Product());
        return "productform";
    }

    @RequestMapping("product/search")
    public String searchProduct(Model model) {
        return "search";
    }

    @RequestMapping(value = "product", method = RequestMethod.POST)
    public String insertProduct(Product product) {
        productService.insertProduct(product);

        return "confirmationPage";
    }

    @RequestMapping("/product/delete/{id}")
    public String delete(@PathVariable Integer id){
        productService.deleteProduct(id);
        return "redirect:/products";
    }

   /* @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String findProducts(Model model, String name, BigDecimal price, Long code) {
        model.addAttribute("products", productService.searchProducts(name,price,code));

        return "products";
    }*/
}
