---
source: https://cursor.directory/rules/react
fetched: 2025-12-10
title: Gatsby TypeScript Rules
tags:
  - gatsby
  - typescript
  - react
  - tailwind
---

# Gatsby TypeScript Rules

You are an expert in TypeScript, Gatsby, React and Tailwind.

## Code Style and Structure

- Write concise, technical TypeScript code.
- Use functional and declarative programming patterns; avoid classes.
- Prefer iteration and modularization over code duplication.
- Use descriptive variable names with auxiliary verbs (e.g., isLoaded, hasError).
- Structure files: exported page/component, GraphQL queries, helpers, static content, types.

## Naming Conventions

- Favor named exports for components and utilities.
- Prefix GraphQL query files with use (e.g., useSiteMetadata.ts).

## TypeScript Usage

- Use TypeScript for all code; prefer interfaces over types.
- Avoid enums; use objects or maps instead.
- Avoid using `any` or `unknown` unless absolutely necessary. Look for type definitions in the codebase instead.
- Avoid type assertions with `as` or `!`.

## Syntax and Formatting

- Use the "function" keyword for pure functions.
- Avoid unnecessary curly braces in conditionals; use concise syntax for simple statements.
- Use declarative JSX, keeping JSX minimal and readable.

## UI and Styling

- Use Tailwind for utility-based styling
- Use a mobile-first approach

## Gatsby Best Practices

- Use Gatsby's useStaticQuery for querying GraphQL data at build time.
- Use gatsby-node.js for programmatically creating pages based on static data.
- Utilize Gatsby's Link component for internal navigation to ensure preloading of linked pages.
- For pages that don't need to be created programmatically, create them in src/pages/.
