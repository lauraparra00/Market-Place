package com.factoria.products.services;

import com.factoria.products.dto.ProductRequestDto;
import com.factoria.products.models.Product;
import com.factoria.products.models.User;

import java.util.List;

public interface IProductService {

    List<Product> getAll();

    Product create(ProductRequestDto productDto, User authUser);


}
