# Design Patterns Using Java
Studying through the book **Head First Design Patterns - O'Reilly** to expand OO and software architecture knowledge. Also I am adapting the code to cover all core methods with tests using JUnit and making some annotations to readapt faster when it comes the time to reuse any of these pattern. 

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
The Observer Pattern defines a one-to-many dependency 
between objects so that when one object changes state, 
all of its dependents are notified and updated automatically.
```
The Weather app consists on notifying displays classes about changes in main data (temperature, humidity, pressure) triggering the update method to show new info. The Observable implements an interface and save observers on it instance so it can add observers, remove observers and call the update method whenever there is change on data. It's a simple but high used design pattern that favors composition over inherintance.

## 3. Starbuzz Coffee (Decorator Pattern)

```html
Attach additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for 
extending functionality.
```html

The Starbuzz Coffee example, show us the need to give additional ingredients to a coffee on a flexible way, so we can _"close the code for modification and open for extension"_. This pattern show us that we can wrap objects with others that are have the same similarity (beverages in this case), in a gross mode, we could say Mocha, Soy and Decaf are Beverages and we can apply the decorate pattern simulating: Mocha wraps Soy that Wraps Decaf (it gets the feel of recursion) but the core beverages are a little different than the decorators itself.
For my little experience, I could see that this pattern is good but could add lots of complexity if not used correctly and wisely.
