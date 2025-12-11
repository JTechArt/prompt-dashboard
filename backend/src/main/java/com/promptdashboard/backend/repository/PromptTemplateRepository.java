package com.promptdashboard.backend.repository;

import com.promptdashboard.backend.model.PromptTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface PromptTemplateRepository extends MongoRepository<PromptTemplate, String> {
    List<PromptTemplate> findByCategoryId(String categoryId);

    List<PromptTemplate> findByCreatedBy(String createdBy);
}
