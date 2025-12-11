package com.promptdashboard.backend.service;

import com.promptdashboard.backend.exception.ResourceNotFoundException;
import com.promptdashboard.backend.model.Category;
import com.promptdashboard.backend.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public List<Category> getAllCategories() {
        return repository.findAll();
    }

    public Category createCategory(Category category) {
        if (repository.findByName(category.getName()).isPresent()) {
            throw new IllegalArgumentException("Category with name " + category.getName() + " already exists");
        }
        return repository.save(category);
    }

    public void deleteCategory(String id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Category not found");
        }
        repository.deleteById(id);
    }
}
