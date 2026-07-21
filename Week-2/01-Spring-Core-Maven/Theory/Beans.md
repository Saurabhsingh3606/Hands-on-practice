# Bean

1. Definition

A Bean is an object managed by the Spring container. Beans are created, configured, and managed by the container.

2. Why it is used

- Centralized lifecycle management and configuration

3. Internal Working

- Beans are defined in XML or annotated classes; container handles lifecycle methods and scopes.

4. Real-world Example

- Service objects, repositories, controllers as beans.

5. Java Example

```java
@Bean
public DataSource dataSource() { ... }
```

6. Diagram

- ApplicationContext -> Bean Definition -> Bean Instance

7. Advantages

- Lifecycle hooks, scopes, AOP integration

8. Disadvantages

- Complexity for small apps

9. Common Mistakes

- Using singleton mutable beans incorrectly in multi-threaded contexts

10. Best Practices

- Keep beans stateless when possible

11. Interview Questions

- Explain bean scopes and lifecycle callbacks.

12. Dry Run

- Demonstrate initialization, postConstruct, preDestroy

13. Industry Usage

- All Spring applications use beans extensively.
