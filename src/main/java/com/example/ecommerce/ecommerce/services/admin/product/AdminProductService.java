package com.example.ecommerce.ecommerce.services.admin.product;

import com.example.ecommerce.ecommerce.dto.ProductDto;

import java.io.IOException;
import java.util.List;

public interface AdminProductService {

    ProductDto addProduct(ProductDto productDto) throws IOException;
    List<ProductDto> getAllProducts();
}
