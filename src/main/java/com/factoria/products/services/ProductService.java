package com.factoria.products.services;


import com.factoria.products.dto.ProductRequestDto;
import com.factoria.products.models.Product;
import com.factoria.products.models.User;
import com.factoria.products.repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    private IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }


    @Override
    public Product create(ProductRequestDto productDto, User auth) {
        var product = new Product();
        product.setName(productDto.getName());
        product.setImg(productDto.getImg());
        product.setPrice(productDto.getPrice());
        product.setSeller(auth);
        return productRepository.save(product);

    }
}
