# Test Plan

## Unit Tests
### `PromptTemplateServiceTest.java`
- **testProcessTemplate_BuiltInPlaceholders**: Verify `$$TODAY` and `$$NOW` are replaced.
- **testProcessTemplate_CustomParameters**: Verify provided map values replace matching placeholders.
- **testCreateTemplate**: Verify repository `save` is called.
- **testDeleteTemplate_NotFound**: Verify `ResourceNotFoundException` is thrown.

## Integration Tests
### `PromptDashboardApplicationTests.java`
- **contextLoads**: Basic validity check.

### `CategoryControllerIT.java` (Optional/Next Step)
- Verify POST /api/categories creates a document in Embedded Mongo (or mocked).

## Regression Tests
- None required (new features being covered).
