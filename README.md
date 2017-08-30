# DesignPatternsStudy
Studying through the book Head First Design Patterns to expand OO and software architecture knowledge. Also I am adapting the code to cover all core methods with tests using JUnit. 

## Config

* IntelliJ 2017.2
* jdk 1.8
* Maven
* Junit 4.8.2
* hamcrest 1.1

Jetbrains created a nice IDE for developing Java (IntelliJ), that really help us focusing on coding and inspecting changes and tests. I also added the .Idea config into this rep too, so it would be easy to config everything from another machine.

## 1. Ducks (Strategy Pattern)

This mini project show us a lot about Design Principles, through an application that simulate ducks creations it shows us how ducks can have different behaviours and that we need to have a flexible code to lose less time with maintenance. This can be achieved implementing to interfaces, using composition and identifying the parts of code that may vary.

```javascript
The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.
```

