# XML Configuration

1. Definition

XML-based configuration lets you declare bean definitions and wiring in XML files (e.g., `applicationContext.xml`).

2. Why it is used

- Historically the primary configuration mechanism; useful for externalized configuration

3. Internal Working

- Container reads XML, creates bean definitions and instances

4. Real-world Example

- Legacy projects often use XML for wiring multiple modules

5. Java Example (XML)

```xml
<bean id="bookService" class="com.example.BookService" />
```

6. Diagram

- XML -> Bean definitions -> Container -> Beans

7. Advantages

- Clear separation of configuration; easier to change without recompilation

8. Disadvantages

- Verbose and error-prone compared to annotations

9. Common Mistakes

- Typos in class names; missing namespace declarations

10. Best Practices

- Prefer annotations for new projects; use XML when required

11. Interview Questions

- How to migrate XML config to annotation-based config?

12. Dry Run

- Show loading `ClassPathXmlApplicationContext` with `applicationContext.xml`

13. Industry Usage

- Still present in legacy applications; gradually replaced by annotations and Java config
