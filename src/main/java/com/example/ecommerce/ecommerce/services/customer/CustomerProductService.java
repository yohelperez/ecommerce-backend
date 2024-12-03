package com.example.ecommerce.ecommerce.services.customer;

import com.example.ecommerce.ecommerce.dto.ProductDto;

import java.util.List;

public interface CustomerProductService {

    public List<ProductDto> getAllProducts();
    public List<ProductDto> getAllProductByName(String name);
}
