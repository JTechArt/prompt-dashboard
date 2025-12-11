# Implementation Notes - Draft

## Decisions
- Will use `src/test/java` for all tests.
- Will use JUnit 5 and Mockito (standard in Spring Boot starter test).
- `.gitignore` will be placed in `backend/` root.
- **Swagger**: Will use `springdoc-openapi-starter-webmvc-ui` version compatible with Spring Boot 3.x.

## Changes
- [NEW] `backend/.gitignore`
- [MODIFY] `backend/pom.xml` (Current diff included below)
    - Add `springdoc-openapi-starter-webmvc-ui` dependency.
- [NEW] `backend/src/test/java/com/promptdashboard/backend/service/PromptTemplateServiceTest.java`
- [NEW] `backend/src/test/java/com/promptdashboard/backend/BackendApplicationTests.java`
