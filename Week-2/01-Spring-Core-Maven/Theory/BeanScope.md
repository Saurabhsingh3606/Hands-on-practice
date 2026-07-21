# Bean Scope

1. Definition

Bean scope defines the lifecycle and visibility of a bean within the container. Common scopes: `singleton`, `prototype`, `request`, `session`, `application`.

2. Why it is used

- Control bean instantiation and concurrency behavior

3. Internal Working

- Container creates instances per scope rules

4. Real-world Example

- Use `prototype` for stateful objects; `singleton` for stateless services

5. Java Example

```java
@Scope("prototype")
@Component
public class UserSession { ... }
```

6. Diagram

- Lifecycle timelines per scope

7. Advantages

- Fine-grained control over resource usage

8. Disadvantages

- Complexity managing stateful prototype beans

9. Common Mistakes

- Treating `singleton` as thread-safe without ensuring immutability

10. Best Practices

- Prefer stateless singletons; use prototype with caution

11. Interview Questions

- How does prototype scope differ from singleton?

12. Dry Run

- Show container creating multiple prototype instances

13. Industry Usage

- Session/request scopes in web apps; singleton for shared services
