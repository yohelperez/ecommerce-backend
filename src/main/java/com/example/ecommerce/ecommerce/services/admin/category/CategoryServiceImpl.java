package com.example.ecommerce.ecommerce.services.admin.category;

import com.example.ecommerce.ecommerce.dto.CategoryDto;
import com.example.ecommerce.ecommerce.entity.Category;
import com.example.ecommerce.ecommerce.respository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    private final CategoryRepository categoryRepository;

    public Category createCategory(CategoryDto categoryDto) {
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return categoryRepository.save(category);
    }
}
