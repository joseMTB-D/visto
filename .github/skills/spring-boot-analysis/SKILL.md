
---
name: spring-boot-analysis
description: Use this skill whenever the user asks to understand, analyze, investigate or explain a Spring Boot application, its architecture, configuration, dependency injection, REST APIs, controllers, services, repositories, entities, DTOs, beans, Spring Security, transactions or application flow.
---

# Spring Boot Analysis

## Objective

Analyze Spring Boot applications to help the developer understand their architecture, components, configuration and execution flow.

Prioritize teaching and understanding the existing codebase over generating new code.

## 1. Understand the project

Before analyzing code:

1. Inspect the project structure.
2. Identify the build system: Maven or Gradle.
3. Inspect `pom.xml` or `build.gradle`.
4. Identify the Java version.
5. Identify the Spring Boot version.
6. Identify relevant dependencies and frameworks.
7. Locate the main application class.
8. Identify the architectural patterns used.

Never assume that a project uses a particular Spring Boot version or architecture.

## 2. Analyze the architecture

Identify and explain the responsibilities of:

- Controllers and REST endpoints.
- Services and business logic.
- Repositories and data access.
- Entities and database mappings.
- DTOs and request/response models.
- Mappers and conversion logic.
- Configuration classes.
- Components and Spring Beans.
- Exception handlers.
- Security configuration.
- Filters and interceptors.

Explain how these components interact.

Do not assume that the project follows a standard layered architecture. Describe the architecture actually present.

## 3. Analyze dependency injection

When examining Spring dependencies:

1. Identify where each Bean is declared.
2. Explain how Spring manages its lifecycle.
3. Identify constructor, field or setter injection.
4. Explain the use of `@Component`, `@Service`, `@Repository` and `@Configuration`.
5. Identify Bean scopes when relevant.
6. Detect circular dependencies.
7. Explain `@Qualifier` and `@Primary` when present.

Prefer constructor injection when discussing improvements.

## 4. Analyze REST APIs

For each relevant endpoint, explain:

- HTTP method.
- URL mapping.
- Request parameters.
- Request body.
- Validation rules.
- Authentication and authorization.
- Service methods called.
- Repository operations.
- Response structure.
- HTTP status codes.
- Exception handling.

Trace the complete request lifecycle:

HTTP Request → Controller → Service → Repository → Database → Response.

Use actual method and class names from the project.

## 5. Analyze database interactions

Investigate:

- JPA and Hibernate configuration.
- Entity relationships.
- Lazy and eager loading.
- Transactions.
- Repository queries.
- JPQL and native queries.
- Pagination and sorting.
- N+1 query problems.
- Cascading operations.
- Database constraints.

Explain the consequences of relevant implementation decisions.

## 6. Analyze configuration

Inspect relevant configuration files:

- application.yml
- application.yaml
- application.properties
- Maven or Gradle configuration.
- Profile-specific configuration.
- Environment variables.
- Security configuration.

Explain how profiles and external configuration affect application behavior.

Never expose passwords, tokens, credentials or other secrets in the response.

## 7. Explain Spring annotations

When encountering an important annotation:

1. Explain what it does.
2. Explain why it is used.
3. Explain how Spring processes it.
4. Explain its impact on application execution.
5. Identify potential mistakes in its usage.

Do not explain every annotation unnecessarily. Focus on those relevant to the question.

## 8. Identify potential problems

Look for:

- Incorrect dependency injection.
- Poor separation of responsibilities.
- Transaction management problems.
- Incorrect exception handling.
- Security weaknesses.
- Inefficient database queries.
- Unnecessary dependencies.
- Configuration mistakes.
- Tight coupling.
- Code duplication.

Distinguish confirmed problems from potential risks.

## 9. Teaching requirements

When explaining code:

- Start with a high-level explanation.
- Break down the execution flow.
- Reference actual classes and methods.
- Explain unfamiliar Spring concepts.
- Use small examples when useful.
- Explain why the existing implementation works.
- Highlight important design decisions.

Assume the developer wants to improve their Java and Spring Boot knowledge.

## 10. Output format

Structure the response using:

1. Overview.
2. Architecture and components.
3. Execution flow.
4. Important Spring concepts.
5. Potential problems.
6. Suggested improvements.
7. Learning recommendations.

Do not generate or modify code unless explicitly requested.

Do not invent classes, methods, dependencies or configuration that are not present in the project.
