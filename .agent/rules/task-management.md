---
trigger: always_on
---

# Global AI Task-Management Rules

These rules define how the AI should analyze, plan, design, and implement any new feature, architectural change, or bug fix in this project.

---

## 1. Always Start With Planning

Whenever a new feature, change, improvement, or bug fix is requested, the AI must begin with a structured planning phase before implementation.

Planning must include:

### ✔ 1. Problem Definition
- What is being requested?
- Why is this needed?
- Which user/system component benefits?

### ✔ 2. Acceptance Criteria
- Must be clear, testable, and binary (pass/fail)
- Should use Gherkin format when possible (`Given / When / Then`)

### ✔ 3. Test Plan & Test Cases
- Functional tests
- Edge cases
- Integration scenarios
- Regression tests if required

---

## 2. Feature Implementation Rules

When implementing any feature, the AI must:

### ✔ Break Work Into:
- Small atomic tasks
- Technical subtasks
- Dependencies
- Milestones

### ✔ Architecture Required When:
If a feature changes system structure, architecture, or communication patterns:
- System diagrams (component, sequence, data flow)
- Data structures and schemas
- API contracts
- Migration or versioning plans (if needed)

### ✔ UI / Front-End Features:
Must include:
- Wireframes
- UI mockups
- Component hierarchy
- User interaction flow

---

## 3. Bug Fix Process

For all bug fix requests, the AI must produce:

### ✔ Bug Reproduction Steps  
### ✔ Expected vs Actual Behavior  
### ✔ Root Cause Hypothesis  
### ✔ A New Test Case Covering the Bug  
### ✔ Required Regression Tests  

No fix should begin until tests and acceptance criteria are defined.

---

## 4. Documentation Standards

Each feature or fix must produce documentation inside:

/docs/features/<feature-name>/
/docs/fixes/<bug-id>/



Each folder must contain:

### 1. `problem.md`
- Problem definition  
- Context  
- Constraints  

### 2. `acceptance_criteria.md`
- Gherkin acceptance tests  

### 3. `test_plan.md`
- Test cases  
- Edge cases  
- Regression scenarios  

### 4. `design.md` (if applicable)
- Architecture diagrams  
- Sequence flows  
- API schemas  
- UI mockups  

### 5. `implementation_notes.md`
- Decisions  
- Assumptions  
- Changes made  
- Todos  

Documentation must always reflect the **final implemented behavior**.

---

## 5. Change Management

If any scope, architecture, or logic changes during implementation:

- Documentation must be updated  
- Diagrams must be updated  
- Acceptance criteria must be updated  
- Test cases must be updated  

No exceptions.

---

## 6. AI Output Format Standard

For every request, the assistant must answer using this structure:

1. **Problem Definition**  
2. **Acceptance Criteria**  
3. **Test Plan & Test Cases**  
4. **Architecture / Design (if needed)**  
5. **UI Mockups (if needed)**  
6. **Task Breakdown**  
7. **Implementation Proposal**  
8. **Documentation File Structure**  
9. **(After explicit user approval) Code Implementation**

---

## 7. Additional Notes
- No code should be generated until planning is approved.
- Large features must be proposed as multi-phase plans.
- All diagrams must be updated immediately when architecture changes.

---

Each folder must contain:

### 1. `problem.md`
- Problem definition  
- Context  
- Constraints  

### 2. `acceptance_criteria.md`
- Gherkin acceptance tests  

### 3. `test_plan.md`
- Test cases  
- Edge cases  
- Regression scenarios  

### 4. `design.md` (if applicable)
- Architecture diagrams  
- Sequence flows  
- API schemas  
- UI mockups  

### 5. `implementation_notes.md`
- Decisions  
- Assumptions  
- Changes made  
- Todos  

Documentation must always reflect the **final implemented behavior**.

---

## 5. Change Management

If any scope, architecture, or logic changes during implementation:

- Documentation must be updated  
- Diagrams must be updated  
- Acceptance criteria must be updated  
- Test cases must be updated  

No exceptions.

---

## 6. AI Output Format Standard

For every request, the assistant must answer using this structure:

1. **Problem Definition**  
2. **Acceptance Criteria**  
3. **Test Plan & Test Cases**  
4. **Architecture / Design (if needed)**  
5. **UI Mockups (if needed)**  
6. **Task Breakdown**  
7. **Implementation Proposal**  
8. **Documentation File Structure**  
9. **(After explicit user approval) Code Implementation**

---

## 7. Additional Notes
- No code should be generated until planning is approved.
- Large features must be proposed as multi-phase plans.
- All diagrams must be updated immediately when architecture changes.

---
