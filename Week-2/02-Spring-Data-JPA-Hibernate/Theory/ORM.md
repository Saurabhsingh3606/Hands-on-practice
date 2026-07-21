# ORM (Object-Relational Mapping)

1. Definition

ORM maps objects in code to relational database tables and vice versa.

2. Need

- Avoid boilerplate JDBC code; map entities to tables

3. Internal Working

- Uses metadata (annotations/XML) to generate SQL for CRUD operations

4. Real Project Example

- Mapping `Book` entity to `books` table

5. Java Example

```java
@Entity
@Table(name = "books")
public class Book { @Id private Long id; private String title; }
```

6. Diagram

- Entity <-> ORM provider (Hibernate) <-> JDBC <-> DB

7. Advantages

- Faster development and maintainability

8. Disadvantages

- Performance overhead if misused

9. Common Mistakes

- N+1 query problems, misuse of lazy loading

10. Best Practices

- Use DTOs for projections, tune fetch strategies

11. Interview Questions

- Explain N+1 problem and how to solve it

12. Dry Run

- Save entity and inspect generated SQL

13. Industry Usage

- Standard in enterprise Java apps
