package com.promptdashboard.backend.controller;

import com.promptdashboard.backend.dto.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/visualization")
public class VisualizationController {

    @PostMapping("/mermaid")
    public ResponseEntity<ApiResponse<String>> generateMermaidScript(@RequestBody Map<String, String> request) {
        String prompt = request.get("prompt");
        // TODO: Integrate with AI service to convert prompt to mermaid script
        // For now, return a placeholder
        String stubMermaid = "graph TD;\n    A[Start] --> B["
                + (prompt != null ? prompt.length() > 20 ? prompt.substring(0, 20) + "..." : prompt : "Instruction")
                + "];";

        return ResponseEntity.ok(ApiResponse.success(stubMermaid, "Generated Mermaid script preview"));
    }
}
