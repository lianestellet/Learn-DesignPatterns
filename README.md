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


## 6. Remote Control (Command Pattern)

```html
Command - Encapsulates a request as an object, thereby letting you
parameterize clients with different requests, queue or log requests, 
and support undoable operations.
```

The Remote Control project asks us to create an automation for household devices, so we could control lights, fans, hottubs and other things of our house with a remote control. This pattern fits very well in this situation, because we know that the user press a button that executes a command, and so we could create a common interface that all commands should implement to decouple the receiver from the invoker separating the logic from the object that is receiving an action. It's a good pattern for requests too, because we can save a set of requests that we could redo them in case of error in one of the steps.

## 7. DuckAdapter (Adapter Pattern)

```html
The Adapter Pattern converts the interface of a class
into another interface the clients expect. Adapter lets
classes work together that couldn’t otherwise because of
incompatible interfaces.
```

It is a pretty simple one, it just changes your interface to what the client expects. In this case our client expects ducks but we have just turkeys, so it was created an adapter that receives an turkey and implements the duck interface, so the client see the adapter as a Duck and it will accept it. It's quite usefull specially dealling with exceptional cases (beware with assumptions, use it wisely). There is two types of adapters, object adapter (used at project) and class adapter, the class adapter require multiple inherintance so it wasn't possible doing it with java.

## 8. Home Theater (Facade Pattern)

```html
The Facade Pattern provides an unified interface to a set 
of interfaces in a subsystem. Face defines a higher-level 
interface that makes the sybsystem easier to use.
```
This one is useful simplifying a large interface / set of interfaces into one that will perform actions based on the needs by delegation. In this example, we saw the complexity to prepare all our objects in our Home Theater project (DVD, Audio, TV, Lights..) so it would take a lot of work to do it over and over everytime that we would watch a movie. We are in a scenery where the facade fits like a glove, because it will just expose for us in an simplified high-level interface with less complexity and decouple the subsystems responsibilities on the client.

## 9. Template Method (Template Pattern)

```html
Template Method - Define the skeleton of an algorithm in an operation,
deferring some steps to subclasses. Template Method lets subclasses redefine
certain steps of an algorithm without changing the algorithm’s structure.
```
This is a nice template when we think about reuse, there is an example showing the steps of preparing different beverages (coffee and tea), so this method wraps the common steps into one superclass that gets all the common behaviours, and abstract the ones leaving the subclass to make it own implementation (tea adding lemon, coffee adding milk for eg.). Although it's really good but not that flexible because this favors inheritance over composition, but it is still a great pattern to use if you have full knowledge of what will be needed linking and abstracting. We learned a lot from hooks too, that using our Template Method we could provide hooks to provide ways of changing the superclass behaviour our changing the outcome, the native Array Sort of Java uses Merge Sort, and Merge Sort uses a hook of CompareTo that shows the Merge Sort how the objects should be compared, so we could implement our own way of comparing objects implementing the Comparable interface and changing the method compareTo. These are very nice tools designing for OO, but they need more than study to be mastered, you need to have a keen eye to identify when to use and how to abstract and give hooks.

## 10. RestaurantMenu (Iterator Pattern)

```html
The Iterator Pattern provides a way to access the elements 
of an aggregate object sequentially without exposing its 
underlying representation.
```

In this project, two restaurants (Breakfast, Lunch) had their own implementation of their menus but they reunited and decided to join forces and become one. But there was a little problem.. even though the menu class have same property one of them was implemented as Array and other as Arraylist. To solve this problem avoiding rewriting alot of code, it was decided to use the Iterator pattern, because we can create a common interface for both menus wrapping the iteration into it.

## 11. RestaurantMenu (Composite Pattern)

```html
Compose objects into tree structures to represent partwhole
hierarchies. Composite lets clients treat individual objects 
and compositions of objects uniformly;
```

On the same project, there was another situation where they wanted to aggregate a dessert menu inside our current lunch menu but at first it wasn't possible, because a Menu just accepted a menu item and not another menu. To overcome this, this pattern suggest us to created a common interface for both Menu and MenuItem so you can create Menus inside other Menus and iterate over them like a tree, so we have to put extra implementation for Menu and MenuItems so they could be seen as similarly. We had violated one of the OO principles in this project (single responsability) in exchange for tranparency, but keep in mind that there is a safety tradeoff and also that is good to balance safety with transparency accordingly with the project needs.
