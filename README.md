
# zBANK-Java: A COBOL to Java Migration Project

## 1. Project Overview

This project is a strategic migration of the `zBANK` application from its original COBOL codebase to a modern Java-based solution. The primary objective is to modernize the application, improve maintainability, and leverage the benefits of the Java ecosystem.

- **Source Repository (COBOL):** [Nantero1/zBANK](https://github.com/Nantero1/zBANK)
- **Target Repository (Java):** [scalabreseGD/zBANK-Java](https://github.com/scalabreseGD/zBANK-Java)

## 2. Migration Objectives

- **Modernization:** Transition from a legacy COBOL application to a modern Java technology stack.
- **Maintainability:** Improve the ease of maintenance and future development.
- **Scalability:** Position the application for future growth and scalability.
- **Performance:** Ensure the migrated application meets or exceeds the performance of the original.
- **Functionality:** Achieve functional parity with the original COBOL application.

## 3. Architecture

The new `zBANK-Java` application will be built on a modern, layered architecture.

- **Presentation Layer:** A web-based interface using a modern front-end framework (to be determined).
- **Service Layer:** A set of RESTful services that expose the application's business logic.
- **Business Logic Layer:** The core application logic, migrated from the original COBOL programs.
- **Data Access Layer:** A persistence layer that interacts with the database.

## 4. Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Apache Maven
- An IDE that supports Java and Maven (e.g., IntelliJ IDEA, Eclipse)

### Installation

1.  **Clone the repository:**
    ```bash
    git clone https://github.com/scalabreseGD/zBANK-Java.git
    ```
2.  **Build the project:**
    ```bash
    mvn clean install
    ```

## 5. Development Guide

### Contributing

We welcome contributions to the `zBANK-Java` project. Please follow these steps to contribute:

1.  Fork the repository.
2.  Create a new branch for your feature or bug fix.
3.  Make your changes and commit them with clear, descriptive messages.
4.  Push your changes to your fork.
5.  Create a pull request against the `main` branch of the `zBANK-Java` repository.

### Coding Standards

- All code should be written in English.
- Follow the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html).
- All new functionality should be accompanied by unit tests.

## 6. Migration Status

The migration is being tracked through GitHub Issues. Each issue corresponds to a specific COBOL program or a set of related functions to be migrated.

- **[View Open Issues](https://github.com/scalabreseGD/zBANK-Java/issues)**

| Status      | Description                                     |
| ----------- | ----------------------------------------------- |
| **To Do**   | COBOL programs that have not yet been migrated. |
| **In Progress** | COBOL programs that are currently being migrated. |
| **Done**      | COBOL programs that have been successfully migrated. |

## 7. Known Issues

Any known issues or bugs will be tracked in the [GitHub Issues](https://github.com/scalabreseGD/zBANK-Java/issues) section of the repository.

## 8. License

This project is licensed under the MIT License. See the `LICENSE` file for more details.
