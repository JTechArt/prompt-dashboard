package com.promptdashboard.backend.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Data
@Document(collection = "prompt_templates")
public class PromptTemplate {
    @Id
    private String id;

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Content is required")
    private String content;

    private String categoryId;

    private List<String> tags;

    // Stores metadata about wildcards/placeholders ex: { "TONE": { "type":
    // "SELECT", "options": ["Happy", "Sad"] } }
    private Map<String, Object> parameters;

    private String createdBy; // Username

    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;
}
