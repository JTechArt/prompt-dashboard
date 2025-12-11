package com.promptdashboard.backend.controller;

import com.promptdashboard.backend.dto.ApiResponse;
import com.promptdashboard.backend.model.PromptTemplate;
import com.promptdashboard.backend.service.PromptTemplateService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/templates")
@RequiredArgsConstructor
public class PromptTemplateController {

    private final PromptTemplateService service;

    @GetMapping
    public ResponseEntity<ApiResponse<List<PromptTemplate>>> getAllTemplates() {
        return ResponseEntity.ok(ApiResponse.success(service.getAllTemplates()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<PromptTemplate>> getTemplate(@PathVariable String id) {
        return ResponseEntity.ok(ApiResponse.success(service.getTemplateById(id)));
    }

    @PostMapping
    public ResponseEntity<ApiResponse<PromptTemplate>> createTemplate(@Valid @RequestBody PromptTemplate template) {
        return ResponseEntity
                .ok(ApiResponse.success(service.createTemplate(template), "Template created successfully"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<PromptTemplate>> updateTemplate(@PathVariable String id,
            @Valid @RequestBody PromptTemplate template) {
        return ResponseEntity
                .ok(ApiResponse.success(service.updateTemplate(id, template), "Template updated successfully"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteTemplate(@PathVariable String id) {
        service.deleteTemplate(id);
        return ResponseEntity.ok(ApiResponse.success(null, "Template deleted successfully"));
    }

    @PostMapping("/{id}/process")
    public ResponseEntity<ApiResponse<String>> processTemplate(@PathVariable String id,
            @RequestBody Map<String, String> values) {
        String processed = service.processTemplate(id, values);
        return ResponseEntity.ok(ApiResponse.success(processed, "Template processed successfully"));
    }
}
