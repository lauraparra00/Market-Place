package com.factoria.products.controllers;


import com.factoria.products.dto.ProductRequestDto;
import com.factoria.products.models.Product;
import com.factoria.products.models.User;
import com.factoria.products.services.IProductService;
import com.factoria.products.services.IUserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="*")
public class ProductController {


    private IProductService productService;
    private IUserService userService;

    public ProductController(IProductService productService, IUserService userService) {
        this.productService = productService;
        this.userService = userService;
    }

    @GetMapping("/products")
    List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping("/products")
    Product create(@RequestBody ProductRequestDto productRequest) {
        var authUser = getAuthUser();
        return productService.create(productRequest, authUser);
    }

    private User getAuthUser() {
        return userService.getById(1L);
    }
}
