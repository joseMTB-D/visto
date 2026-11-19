
---
name: debugging
description: Use this skill whenever the user asks to debug, investigate, troubleshoot, diagnose or fix Java or Spring Boot errors, exceptions, stack traces, failed requests, unexpected behavior, application crashes, build failures, runtime problems, database errors or integration issues.
---

# Java and Spring Boot Debugging

## Objective

Systematically investigate and diagnose problems in Java and Spring Boot applications.

Prioritize finding the root cause rather than applying superficial fixes.

Explain the problem so the developer understands why it happens and how to prevent it.

## 1. Understand the problem

Before proposing a solution:

1. Identify the reported behavior.
2. Identify the expected behavior.
3. Locate the relevant classes and methods.
4. Inspect the execution context.
5. Review relevant logs and stack traces.
6. Identify recent changes when that information is available.
7. Determine whether the problem occurs during compilation, startup, runtime or testing.

Ask for missing information only when it is essential.

Never assume the reported error is the actual root cause.

## 2. Analyze exceptions

When examining an exception:

1. Identify the exception type.
2. Locate the first relevant application stack frame.
3. Identify the method that triggered the failure.
4. Trace the calling methods.
5. Inspect the values involved.
6. Identify the underlying condition that caused the exception.
7. Determine whether the exception is handled correctly.

Pay particular attention to:

- NullPointerException.
- IllegalArgumentException.
- IllegalStateException.
- ClassCastException.
- ConcurrentModificationException.
- DataAccessException.
- EntityNotFoundException.
- LazyInitializationException.
- ConstraintViolationException.
- MethodArgumentNotValidException.
- HttpMessageNotReadableException.
- ResponseStatusException.
- BeanCreationException.

Do not assume the exception type alone identifies the root cause.

## 3. Analyze Java problems

Investigate:

- Null references.
- Incorrect object initialization.
- Incorrect equals() and hashCode().
- Incorrect collection handling.
- Mutable shared state.
- Concurrency problems.
- Thread safety.
- Incorrect exception handling.
- Resource leaks.
- Incorrect stream operations.
- Optional misuse.
- Type conversion problems.
- Incorrect date and time handling.

Explain the relevant Java language behavior.

## 4. Analyze Spring Boot problems

Investigate:

- Dependency injection failures.
- Bean creation errors.
- Component scanning.
- Incorrect configuration.
- Profile activation.
- Transaction management.
- Security filters.
- Request mappings.
- Validation.
- Serialization and deserialization.
- Database connections.
- JPA persistence context.
- Application lifecycle.
- External service integrations.

Verify the actual Spring Boot version before recommending version-specific solutions.

## 5. Analyze database errors

Investigate:

- SQL exceptions.
- Constraint violations.
- Incorrect entity mappings.
- Missing records.
- Duplicate records.
- Transaction boundaries.
- Locking problems.
- Lazy loading.
- Incorrect queries.
- Connection pool exhaustion.
- N+1 queries.

Differentiate between database errors and errors caused by application logic.

## 6. Analyze logs and stack traces

When logs are available:

1. Identify the first error.
2. Separate the primary exception from subsequent exceptions.
3. Inspect the complete cause chain.
4. Identify the first relevant application class.
5. Correlate timestamps and request identifiers when available.
6. Determine whether the error is reproducible.

Do not focus exclusively on the last line of a stack trace.

Never expose credentials, access tokens or sensitive information from logs.

## 7. Root cause analysis

For every confirmed problem, provide:

- **Symptom:** What happens?
- **Root cause:** Why does it happen?
- **Location:** Which class and method are involved?
- **Evidence:** What in the code or logs supports the diagnosis?
- **Impact:** What functionality is affected?
- **Solution:** What should be changed?
- **Prevention:** How can similar problems be avoided?

Clearly distinguish confirmed causes from hypotheses.

## 8. Fixing strategy

Before modifying code:

1. Explain the proposed fix.
2. Identify the affected files.
3. Consider possible side effects.
4. Prefer the smallest safe change.
5. Preserve existing architecture and conventions.
6. Avoid unnecessary dependencies.
7. Avoid unrelated refactoring.

Do not rewrite entire classes when a small correction is sufficient.

Do not modify files until the user asks you to implement the fix.

## 9. Verification

After implementing a fix, when authorized:

1. Run the most relevant unit tests.
2. Run related integration tests when appropriate.
3. Compile the affected module.
4. Check for regressions.
5. Verify the original problem is resolved.
6. Report any checks that could not be executed.

Never claim that a fix works if it has not been verified.

## 10. Teaching requirements

Explain:

- Why the error occurred.
- Why the proposed solution works.
- Which Java or Spring concept is involved.
- What alternative solutions exist.
- Which solution is most appropriate and why.

Prioritize helping the developer become capable of diagnosing similar problems independently.

## 11. Output format

Use this structure:

1. Problem summary.
2. Root cause.
3. Relevant code location.
4. Technical explanation.
5. Recommended solution.
6. Verification steps.
7. Lessons learned.

Do not invent stack traces, log entries or application behavior.
