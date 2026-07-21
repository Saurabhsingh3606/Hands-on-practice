# Spring Framework

1. Definition

The Spring Framework is a lightweight Java framework that provides comprehensive infrastructure support for developing Java applications. It offers inversion of control (IoC), dependency injection (DI), aspect-oriented programming (AOP), transaction management, and more.

2. Why it is used

- Simplifies Java EE development
- Promotes loose coupling via IoC/DI
- Modular and testable code

3. Internal Working

- Uses IoC container to manage object lifecycle
- Beans are created and wired according to configuration (XML/Annotations)

4. Real-world Example

- E-commerce order processing, where services are injected into controllers and repositories.

5. Java Example

```java
// Example: simple service
@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book findById(Long id) { return repository.findById(id).orElse(null); }
}
```

6. Diagram

- (Use a simple box diagram: Controller -> Service -> Repository -> Database)

7. Advantages

- Lightweight, modular, reduces boilerplate

8. Disadvantages

- Learning curve and configuration complexity for advanced features

9. Common Mistakes

- Overusing singletons, incorrect bean scopes, missing component-scan

10. Best Practices

- Use constructor injection, keep beans small, write unit tests

11. Interview Questions

- What is Spring IoC? Explain DI.

12. Dry Run

- Walk through how application context instantiates beans on startup

13. Industry Usage

- Widely used across enterprise Java applications


After reviewing this file, ask for 5 theory questions, 3 coding questions, and 1 Cognizant interview question.