# Low Level Design Implementations in Java

This repository contains implementations of various low-level design patterns in Java. Each design pattern is encapsulated in its own folder with the necessary classes and a `Runner` class to execute the pattern.

## Design Patterns Implemented
The following design patterns are implemented in this repository:

- Abstract Factory
- Builder
- Facade
- Factory
- Prototype
- Singleton

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- An IDE or text editor of your choice

### Running a Design Pattern
To run a particular design pattern, follow these steps:

1. **Clone the repository**:
   ```sh
   git clone https://github.com/kevintamakuwala/LLD-Design-Patterns.git
   cd LLD-Design-Patterns
   ```
2. **Add the design pattern folder to the classpath**:
   You can do this by setting the classpath in your IDE or using the command line. For example, if you want to run the Factory pattern:
   ```sh
   cd src/factory
   javac -cp . FactoryRunner.java
   java -cp . FactoryRunner
   ```
3. Run the Runner class:
   Each design pattern folder contains a Runner class that includes the main method to execute the pattern.
