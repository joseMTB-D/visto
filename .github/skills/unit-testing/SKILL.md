
---
name: unit-testing
description: Use this skill whenever the user asks to create, generate, explain, analyze, improve, review or troubleshoot Java unit tests, JUnit, Mockito, Spring Boot tests, assertions, test coverage, test cases, parameterized tests, mocks, stubs or test failures.
---

# Java Unit Testing

## Objective

Help the developer create reliable, maintainable and meaningful tests for Java and Spring Boot applications.

Prioritize testing actual behavior rather than implementation details.

Use the testing libraries and conventions already present in the project.

## 1. Inspect the testing environment

Before creating tests:

1. Inspect pom.xml or build.gradle.
2. Identify the Java version.
3. Identify the JUnit version.
4. Identify whether Mockito is available.
5. Identify whether AssertJ is available.
6. Identify Spring Boot testing dependencies.
7. Inspect existing test classes.
8. Identify naming and package conventions.

Never introduce a new testing framework without justification.

Do not assume JUnit 5, Mockito or AssertJ are available.

## 2. Analyze the code under test

Before writing tests:

1. Identify the class responsibility.
2. Identify public methods and expected behavior.
3. Identify input parameters.
4. Identify return values.
5. Identify possible exceptions.
6. Identify external dependencies.
7. Identify relevant edge cases.
8. Identify business rules.

Understand the code before generating tests.

## 3. Define test scenarios

Consider the following categories:

### Happy path

- Valid input.
- Expected return value.
- Expected interactions with dependencies.
- Correct state changes.

### Edge cases

- Null values when permitted or relevant.
- Empty strings.
- Empty collections.
- Boundary values.
- Minimum and maximum values.
- Optional values.
- Unusual but valid input.

### Error cases

- Invalid input.
- Missing entities.
- Dependency failures.
- Exceptions.
- Validation errors.
- Database constraint violations.

Only include scenarios that make sense for the actual method.

## 4. JUnit practices

Follow the project's existing JUnit version.

When JUnit 5 is available:

- Use @Test.
- Use @BeforeEach and @AfterEach when appropriate.
- Use @ParameterizedTest for repeated input scenarios.
- Use @MethodSource or @CsvSource when useful.
- Use assertEquals, assertTrue, assertFalse and assertThrows appropriately.
- Use assertAll when multiple independent assertions improve clarity.

Use descriptive test names.

Prefer names that explain:

- The method being tested.
- The condition.
- The expected result.

Example:

shouldReturnCustomerWhenCustomerExists()

## 5. Mockito practices

When Mockito is available:

- Use @Mock for dependencies.
- Use @InjectMocks when appropriate.
- Use when() to define mock behavior.
- Use verify() to validate relevant interactions.
- Use ArgumentCaptor when argument inspection is necessary.
- Use doThrow() or thenThrow() to simulate failures.

Avoid:

- Excessive mocking.
- Mocking the class under test.
- Testing Mockito configuration instead of business behavior.
- Unnecessary verify() calls.
- Mocking simple value objects.
- Overly complex test setup.

Do not mock a dependency if a real lightweight implementation makes the test clearer and more reliable.

## 6. Spring Boot testing

Choose the smallest appropriate test scope.

### Unit tests

Use when testing isolated business logic.

Prefer plain JUnit and Mockito without starting the Spring context.

### Web layer tests

Use @WebMvcTest when testing MVC controllers and their HTTP behavior.

Consider MockMvc for requests and responses.

Test:

- HTTP methods.
- Request mappings.
- Request validation.
- Response status.
- Response body.
- Exception handling.
- Security behavior when relevant.

### Integration tests

Use @SpringBootTest when the test needs the application context or several components working together.

Consider:

- @DataJpaTest for JPA persistence tests.
- Testcontainers when the project already supports it.
- @Transactional when appropriate.
- Real database behavior when it matters.

Do not use @SpringBootTest for every test.

## 7. Test structure

Prefer the Arrange, Act, Assert pattern.

Example:

```java
@Test
void shouldReturnCustomerWhenCustomerExists() {
    // Arrange
    Long customerId = 1L;
    Customer expected = new Customer();

    when(customerRepository.findById(customerId))
        .thenReturn(Optional.of(expected));

    // Act
    Customer result = customerService.findById(customerId);

    // Assert
    assertEquals(expected, result);
}
```

Adapt examples to the actual project classes and conventions.

## 8. Test quality

Every test should:

- Have a clear purpose.
- Be independent.
- Be deterministic.
- Be readable.
- Verify observable behavior.
- Avoid unnecessary setup.
- Avoid depending on execution order.
- Clean up resources when necessary.

Avoid:

- Tests with no meaningful assertions.
- Assertions against internal implementation details.
- Excessive conditional logic.
- Arbitrary sleeps.
- Shared mutable state.
- Tests dependent on external services without controlled fixtures.

## 9. Coverage and missing tests

When reviewing existing tests:

1. Identify untested public behavior.
2. Identify missing error scenarios.
3. Identify missing boundary conditions.
4. Identify duplicated test cases.
5. Identify fragile tests.
6. Identify assertions that do not validate meaningful behavior.

Do not optimize exclusively for code coverage percentages.

A high coverage percentage does not guarantee good tests.

## 10. Test execution

When authorized to execute tests:

1. Run the smallest relevant test class.
2. Analyze compilation errors.
3. Analyze failing assertions.
4. Identify whether the failure comes from production code or test code.
5. Run the relevant module tests.
6. Run the broader test suite when appropriate.

Use the project's existing build tool.

For Maven, prefer the project's existing Maven wrapper when available.

For Gradle, prefer the project's existing Gradle wrapper when available.

Never claim tests passed unless execution confirms it.

## 11. Teaching requirements

When creating or reviewing tests:

- Explain why each scenario is necessary.
- Explain what each mock represents.
- Explain the assertions.
- Explain the testing annotations.
- Identify what is being tested and what is not.
- Explain the difference between unit and integration tests.
- Highlight common testing mistakes.

Help the developer understand how to design tests independently.

## 12. Output format

When generating tests, provide:

1. Class under test.
2. Testing strategy.
3. Scenarios covered.
4. Complete test code.
5. Explanation of important assertions.
6. How to execute the tests.
7. Additional scenarios worth testing.

Do not invent business rules or expected results.

If expected behavior is unclear, ask before writing tests that would encode assumptions.
