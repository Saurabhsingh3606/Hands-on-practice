# Inversion of Control (IoC)

1. Definition

IoC is a design principle where the control of object creation and wiring is transferred from the application code to an external container/framework (the Spring IoC container).

2. Why it is used

- Promotes loose coupling and easier testing

3. Internal Working

- Spring container reads configuration and instantiates beans, injecting dependencies where required.

4. Real-world Example

- A web controller doesn't create its service; the container injects the required service.

5. Java Example

```java
@Component
public class OrderController {
    private final OrderService orderService;
    public OrderController(OrderService orderService) { this.orderService = orderService; }
}
```

6. Diagram

- Container -> instantiate bean -> inject dependencies

7. Advantages

- Better modularity, testability

8. Disadvantages

- Indirection may confuse beginners

9. Common Mistakes

- Circular dependencies without proper design

10. Best Practices

- Use constructor injection, avoid field injection

11. Interview Questions

- Explain differences between Dependency Injection and Service Locator.

12. Dry Run

- Show creating beans, resolving dependencies, and lifecycle callbacks.

13. Industry Usage

- Everywhere in Spring-based apps.
