package com.promptdashboard.backend.service;

import com.promptdashboard.backend.exception.ResourceNotFoundException;
import com.promptdashboard.backend.model.PromptTemplate;
import com.promptdashboard.backend.repository.PromptTemplateRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class PromptTemplateService {

    private final PromptTemplateRepository repository;

    public List<PromptTemplate> getAllTemplates() {
        return repository.findAll();
    }

    public PromptTemplate getTemplateById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Prompt Template not found with id: " + id));
    }

    public PromptTemplate createTemplate(PromptTemplate template) {
        return repository.save(template);
    }

    public PromptTemplate updateTemplate(String id, PromptTemplate template) {
        PromptTemplate existing = getTemplateById(id);
        existing.setTitle(template.getTitle());
        existing.setContent(template.getContent());
        existing.setCategoryId(template.getCategoryId());
        existing.setTags(template.getTags());
        existing.setParameters(template.getParameters());
        return repository.save(existing);
    }

    public void deleteTemplate(String id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Prompt Template not found with id: " + id);
        }
        repository.deleteById(id);
    }

    public String processTemplate(String id, Map<String, String> values) {
        PromptTemplate template = getTemplateById(id);
        String content = template.getContent();

        // 1. Built-in placeholders
        content = content.replace("$$TODAY", LocalDate.now().toString());
        content = content.replace("$$NOW", LocalDateTime.now().toString());

        // 2. Custom parameters from user
        if (values != null) {
            for (Map.Entry<String, String> entry : values.entrySet()) {
                // Assuming placeholders are like {{KEY}} or just simple replace?
                // User said "wildcards like $$TODAY... or defined as custom".
                // Let's assume custom ones might be defined by the user in the prompt text.
                // We will replace exact matches of the key or $$KEY.
                // Let's adopt a convention: if user passes key="TOPIC", we replace "$$TOPIC".
                // Or we can just replace the key literal.
                // Let's try replacing "$$" + key as a convention, and also just key (be careful
                // with overlaps).
                // Safest to enforce "$$" prefix or similar for now.
                String key = entry.getKey();
                String value = entry.getValue();

                // Replace $$KEY
                content = content.replace("$$" + key, value);
                // Also replace {{KEY}} (common style)
                content = content.replace("{{" + key + "}}", value);
            }
        }

        return content;
    }
}
