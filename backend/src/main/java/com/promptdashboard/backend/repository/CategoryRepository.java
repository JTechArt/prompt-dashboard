package com.promptdashboard.backend.repository;

import com.promptdashboard.backend.model.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface CategoryRepository extends MongoRepository<Category, String> {
    Optional<String> findByName(String name);
}
