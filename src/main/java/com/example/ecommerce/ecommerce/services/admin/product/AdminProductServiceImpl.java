package com.example.ecommerce.ecommerce.services.admin.product;

import com.example.ecommerce.ecommerce.dto.ProductDto;
import com.example.ecommerce.ecommerce.entity.Category;
import com.example.ecommerce.ecommerce.entity.Product;
import com.example.ecommerce.ecommerce.respository.CategoryRepository;
import com.example.ecommerce.ecommerce.respository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AdminProductServiceImpl implements AdminProductService {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public ProductDto addProduct(ProductDto productDto) throws IOException {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setImg(productDto.getImg().getBytes());

        Category category = categoryRepository.findById(productDto.getCategoryId()).orElseThrow();

        product.setCategory(category);

        return productRepository.save(product).getDto();
    }

    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();

        return products.stream().map(Product::getDto).collect(Collectors.toList());
    }
}
