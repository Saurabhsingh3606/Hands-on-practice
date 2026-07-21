# Spring Boot - Introduction

1. Definition

Spring Boot simplifies Spring application setup by providing auto-configuration and opinionated defaults.

2. Why it is used

- Rapid application development with embedded servers and starters

3. Internal Working

- Auto-configuration picks beans based on classpath and properties

4. Real-world Example

- Standalone REST service with embedded Tomcat

5. Java Example

```java
@SpringBootApplication
public class App { public static void main(String[] args) { SpringApplication.run(App.class, args); } }
```

6. Diagram

- Application -> Spring Boot -> Auto-config -> Embedded container

7. Advantages

- Minimal configuration, fast prototyping

8. Disadvantages

- Magic hides complexity; can increase startup time

9. Common Mistakes

- Adding unnecessary starters; not understanding auto-configuration

10. Best Practices

- Keep `application.properties` minimal; prefer explicit configuration for critical components

11. Interview Questions

- What is Spring Boot starter? How auto-configuration works?

12. Dry Run

- Create Spring Boot project with `spring-boot-starter-web` and run

13. Industry Usage

- Default choice for microservices in Java ecosystem
