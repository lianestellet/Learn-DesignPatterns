# Design Patterns (Java)
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

This mini project show us a lot about Design Principles, through an application that simulate ducks creations it shows us how ducks can have different behaviours and that we need to have a flexible code to lose less time with maintenance. This can be achieved by **_implementing to interfaces, using composition and encapsulating the parts that may vary_**.


## 2. Weather o Rama (Observer Pattern)

```html
The Observer Pattern defines a one-to-many dependency 
between objects so that when one object changes state, 
all of its dependents are notified and updated automatically.
```  

The Weather app consists on notifying displays classes about changes in main data (temperature, humidity, pressure) triggering the update method to show new info. The Observable implements an interface and save observers on it instance so it can add observers, remove observers and call the update method whenever there is change on data. It's a simple but high used design pattern that **_favors composition over inherintance_**.

## 3. Starbuzz Coffee (Decorator Pattern)

```html
Attach additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for 
extending functionality.
```

The Starbuzz Coffee example simulates a store that have differents types of coffe and wants to add stuffs in a flexible way, so the customer could customize his order, this pattern followed the principle **_"close the code for modification and open for extension"_**. The Decorator show us that we can wrap objects with others that have the same similarity (beverages in this case), in a gross mode we could say that Mocha, Soy and Decaf as Beverages can apply the decorate pattern: Mocha wraps Soy that Wraps Decaf (it gets the feel of recursion) so every cost and description are tied up together and able to change in runtime.
For my little experience, I could see that this pattern is good but could add lots of complexity if not used correctly and wisely.

## 4. PizzaStore (Factory Pattern)


```html
Define an interface for creating an object, but
let subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation 
to the subclasses.
```

The PizzaStore focus on the pizzas creation process (create pizza by type, bake, cut, box). On the process, the store became a franchise and each pizza store have it own way of creating pizzas, so the same pizza type is different from both regions and that's how we choose the factory pattern. All pizza stores have common behavior, they make pizza! what changes are the way they do. So the strategy used by factory is to delegate the object creation to a subclass, so we decouple dependency from our concrete classes and can keep on. Lately, also the ingredients of the pizza started varying (sauce, cheese, veggies) so we separated the responsability for declaring which specific ingredient we are using to our superclass, no matter if is parmesan cheese or mozzarela, it just needs to know that is a cheese, and then the type of cheese creation is delegated to a subclass. I found it a really good pattern and they tie together nice OO concepts like _**Depend on abstractions, not on concrete classes and encapsulate what varies**_.
