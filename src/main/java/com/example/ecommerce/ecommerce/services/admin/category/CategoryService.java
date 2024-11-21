package com.example.ecommerce.ecommerce.services.admin.category;

import com.example.ecommerce.ecommerce.dto.CategoryDto;
import com.example.ecommerce.ecommerce.entity.Category;

import java.util.List;

public interface CategoryService {

    Category createCategory(CategoryDto categoryDto);

    List<Category> getAllCategories();
}
