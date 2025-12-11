package com.promptdashboard.backend.service;

import com.promptdashboard.backend.exception.ResourceNotFoundException;
import com.promptdashboard.backend.model.PromptTemplate;
import com.promptdashboard.backend.repository.PromptTemplateRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PromptTemplateServiceTest {

    @Mock
    private PromptTemplateRepository repository;

    @InjectMocks
    private PromptTemplateService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testProcessTemplate_BuiltInPlaceholders() {
        String templateId = "1";
        PromptTemplate mockTemplate = new PromptTemplate();
        mockTemplate.setId(templateId);
        mockTemplate.setContent("Hello $$TODAY");

        when(repository.findById(templateId)).thenReturn(Optional.of(mockTemplate));

        String result = service.processTemplate(templateId, new HashMap<>());

        assertNotNull(result);
        assertFalse(result.contains("$$TODAY"));
        // We expect today's date, but exact string depends on execution.
        // Just checking placeholder is gone is good enough for basic unit test or check
        // regex match.
    }

    @Test
    void testProcessTemplate_CustomParameters() {
        String templateId = "2";
        PromptTemplate mockTemplate = new PromptTemplate();
        mockTemplate.setId(templateId);
        mockTemplate.setContent("Hello $$NAME");

        when(repository.findById(templateId)).thenReturn(Optional.of(mockTemplate));

        Map<String, String> values = new HashMap<>();
        values.put("NAME", "User");

        String result = service.processTemplate(templateId, values);

        assertEquals("Hello User", result);
    }

    @Test
    void testGetTemplateById_NotFound() {
        String templateId = "99";
        when(repository.findById(templateId)).thenReturn(Optional.empty());

        assertThrows(ResourceNotFoundException.class, () -> service.getTemplateById(templateId));
    }

    @Test
    void testDeleteTemplate_Success() {
        String templateId = "1";
        when(repository.existsById(templateId)).thenReturn(true);

        service.deleteTemplate(templateId);

        verify(repository, times(1)).deleteById(templateId);
    }
}
