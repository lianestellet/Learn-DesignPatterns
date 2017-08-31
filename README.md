# DesignPatternsStudy
Studying through the book Head First Design Patterns to expand OO and software architecture knowledge. Also I am adapting the code to cover all core methods with tests using JUnit and making some annotations to readapt faster when it comes the time to user any pattern. 

## Config

* IntelliJ 2017.2
* jdk 1.8
* Maven
* Junit 4.8.2
* hamcrest 1.1

Jetbrains created a nice IDE for developing Java (IntelliJ), that really help us focusing on coding and inspecting changes and tests. I also added the .Idea config into this rep too, so it would be easy to config everything from another machine.

## 1. Ducks (Strategy Pattern)

```html
The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.
```

This mini project show us a lot about Design Principles, through an application that simulate ducks creations it shows us how ducks can have different behaviours and that we need to have a flexible code to lose less time with maintenance. This can be achieved implementing to interfaces, using composition and identifying the parts of code that may vary.


## 2. Weather o Rama (Observer Pattern)

```html
The Observer Pattern defines a one-to-many
dependency between objects so that when one
object changes state, all of its dependents are
notified and updated automatically.
```
The Weather app consists on notify displays about changes in measurements (temperature, humidity, pressure) so they can change the data to be displayed. The Observable implements an interface and save observers on it instance so it can call the update method whenever there is change on data.
