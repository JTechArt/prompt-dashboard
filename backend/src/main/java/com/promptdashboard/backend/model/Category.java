package com.promptdashboard.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.NotBlank;

@Data
@Document(collection = "categories")
public class Category {
    @Id
    private String id;

    @NotBlank(message = "Name is required")
    private String name;

    private String description;
}
