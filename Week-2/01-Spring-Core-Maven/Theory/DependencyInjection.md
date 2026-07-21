# Dependency Injection (DI)

1. Definition

Dependency Injection is a pattern where dependencies are provided to a class from an external source (container) instead of the class creating them itself.

2. Why it is used

- Decouples implementation from usage, improves testability

3. Internal Working

- Spring resolves bean dependencies using constructor, setter, or field injection.

4. Real-world Example

- A payment processing service receives a `PaymentGateway` implementation at runtime.

5. Java Example

```java
@Component
public class PaymentService {
    private final PaymentGateway gateway;
    @Autowired
    public PaymentService(PaymentGateway gateway) { this.gateway = gateway; }
}
```

6. Diagram

- Class -> receives dependency from container

7. Advantages

- Easier mocking and unit testing

8. Disadvantages

- More configuration overhead initially

9. Common Mistakes

- Using field injection, leading to hidden dependencies

10. Best Practices

- Prefer constructor injection, keep DI boundaries clear

11. Interview Questions

- Explain when to use constructor vs setter injection.

12. Dry Run

- Demonstrate object creation flow with constructor injection.

13. Industry Usage

- Unit testing frameworks work well with DI-based code.
