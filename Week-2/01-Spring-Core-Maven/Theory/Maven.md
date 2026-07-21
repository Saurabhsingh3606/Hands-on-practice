# Maven

1. Definition

Maven is a build and dependency management tool for Java projects.

2. Why it is used

- Standardizes builds, dependency resolution, and project structure

3. Internal Working

- Uses `pom.xml` to declare dependencies, plugins and lifecycle

4. Real-world Example

- Building, testing and packaging an application with `mvn package`

5. Java Example

- See `pom.xml` in hands-on project

6. Diagram

- User -> Maven -> Lifecycle (compile, test, package)

7. Advantages

- Dependency management, reproducible builds

8. Disadvantages

- Complexity with large multi-module projects

9. Common Mistakes

- Using snapshot dependencies in production, missing plugin configuration

10. Best Practices

- Lock versions, use dependencyManagement for multi-module

11. Interview Questions

- Explain Maven lifecycle and phases

12. Dry Run

- `mvn clean package` flow

13. Industry Usage

- Widely used in Java ecosystems
