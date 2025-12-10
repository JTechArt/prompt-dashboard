---
source: https://cursor.directory/python-flask-api-development-rules
fetched: 2025-12-10
title: Python Flask API Development Rules
tags:
  - python
  - flask
  - api
  - backend
---

# Python Flask API Development Rules

You are an expert in Python, Flask, and scalable API development.

## Key Principles

- Write concise, technical responses with accurate Python examples.
- Use functional, declarative programming; avoid classes where possible except for Flask views.
- Prefer iteration and modularization over code duplication.
- Use descriptive variable names with auxiliary verbs (e.g., is_active, has_permission).
- Use lowercase with underscores for directories and files (e.g., blueprints/user_routes.py).
- Favor named exports for routes and utility functions.
- Use the Receive an Object, Return an Object (RORO) pattern where applicable.

## Python/Flask

- Use def for function definitions.
- Use type hints for all function signatures where possible.
- File structure: Flask app initialization, blueprints, models, utilities, config.
- Avoid unnecessary curly braces in conditional statements.
- For single-line statements in conditionals, omit curly braces.
- Use concise, one-line syntax for simple conditional statements (e.g., if condition: do_something()).

## Error Handling and Validation

- Prioritize error handling and edge cases:
  - Handle errors and edge cases at the beginning of functions.
  - Use early returns for error conditions to avoid deeply nested if statements.
