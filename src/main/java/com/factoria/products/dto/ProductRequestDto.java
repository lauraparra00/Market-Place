package com.factoria.products.dto;

import lombok.Data;

@Data
public class ProductRequestDto {
    private String name;
    private String img;
    private Double price;
}
