# Gang of Four (GoF)

---

# 1. Creational Design Patterns
 - Singleton Pattern
 - Prototype Pattern
 - Factory Pattern (Simple) 
 - Builder Pattern
 - Abstract Factory Pattern

---

# 2. Structural Design Patterns
 - Proxy Pattern
 - Decorator Pattern
 - Adapter Pattern
 - Facade Pattern
 - Bridge Pattern
 - Flyweight Pattern
 - Composite Pattern

---

# 3. Behavior Design Patterns
 - Strategy Pattern
 - Command Pattern
 - Template Pattern
 - Iterator Pattern
 - Chain of Responsibility
 - Visitor Pattern

---

## 📌 Singleton Pattern
The **Singleton Pattern** ensures that a class has **only one instance** throughout the entire lifecycle of the Java application and provides a global point of access to it.

### Core Principles
* **One Instance:** A class has only one object.
* **Static Access:** Global point of access via a `static` method.
* **Private Constructor:** Prevents external classes from using the `new` keyword.

---

## 🚀 Key Features

### 1. Lazy Initialization
The object is not created until the first time `getInstance()` is called. This saves memory by avoiding the creation of heavy objects that might never be used.

### 2. Thread Safety
This implementation uses the `synchronized` keyword (or Double-Checked Locking) to ensure that even in a multi-threaded environment, only one instance is ever created.

---

## ✅ Advantages (Pros)
* **Resource Efficiency:** Avoids the overhead of creating numerous objects for a single utility.
* **Garbage Collector Optimization:** By reusing a single instance, we reduce the frequency of **Java's Garbage Collector (GC)** wake-ups, which can improve application performance.
* **Shared State:** Perfect for managing configurations, logging services, or database connection pools.

## ⚠️ Limitations (Cons)
* **Unit Testing Challenges:** Since the state is "global," tests can interfere with each other (State Pollution). If Test A changes a setting, Test B may fail unexpectedly.
* **State Management:** It is best practice to **avoid variables with frequent state changes** inside a Singleton to prevent side effects across the application.

---

## 📌 Prototype Pattern
The **Prototype Pattern** ensures **to create new objects by copying an existing instance (the prototype) rather than using the new keyword**. A **Prototype Registry** (the Map in your code) is the management layer of the Prototype Pattern. While the clone() method handles the copying, the Registry handles the organization and retrieval.

### Core Principles
* **Shallow Copy**
- Only the "top-level" object is new; internal objects (references) are shared.
- The original and the clone are partially dependent. If you modify a shared internal object (like a List or a Date), the change appears in both.
- super.clone() by default.


* **Deep Copy**
- The entire object tree is rebuilt from scratch.
- The original and the clone are 100% independent. Modifying any part of the clone has zero effect on the original.
- Can be done manually or via Serialization

---

## 📌 Factory Pattern (Registry-based)
The **Factory Pattern** ensures provides a central point (the "Factory") to return instances of different classes based on an input.

--

## 📌 Builder Pattern
The **Builder Pattern** allows to create object for complex structure.
- Canonical/Tradational Builder Pattern
- Method Chain or a varaition of tradationl Builder Pattern 

--

## 📌 Abstract Factory Pattern
The **Abstract Factory Pattern** is a factory of factories. It creates a single interface for multiple factories. Each factory is responsible for a related group/family of products.

--

## 📌 Proxy Pattern
The **Proxy Pattern** is a way of saving real object in a variable without creating new object again and again.

--

## 📌 Decorator Pattern
The **Proxy Pattern** is dynamically add new behaviors or responsibilities to an object without changing its original code.The pattern relies on composition rather than inheritance. Instead of creating a massive tree of subclasses to cover every possible combination of features, you wrap your object in a decorator class that has the same interface.

--

## 📌 Adapter Pattern
The **Adapter Pattern** is primarily about compatibility, not necessarily adding "new" features to the logic. However, it follows the Open/Closed Principle, which means you can make the system support new things without changing the old code.

--

## 📌 Facade Pattern
The **Facade Pattern** is controlling multiple subsystems to create a service.

--

## 📌 Bridge Pattern
The **Bridge Pattern** is used to split a large class, or a set of closely related classes, into two separate hierarchies—Abstraction and Implementation—which can be developed independently of each other.

--

## 📌 Flyweight Pattern
The **Flyweight Pattern** is used to manage object creation for saving memory as internal(constant) and external(varies).

--

## 📌 Composite Pattern
The **Composite Pattern** is used to treat individual objects and composition of objects uniformly for recursive nature.

--

## 📌 Strategy Pattern
The **Strategy Pattern** is used to manage different algorithms for a task.

--

## 📌 Command Pattern
The **Command Pattern** is used to encapsulate a method call into an object.

--

## 📌 Template Pattern
The **Template Pattern** is creating a skeleton of an algorithm in a class, deferring some steps to subclasses. It allows subclasses to redefine certain steps of an algorithm without changing the algorithm's structure.

--

## 📌 Iterator Pattern
The **Iterator Pattern** is creating a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It provides a standard way to traverse a collection, regardless of its specific implementation (e.g., List, Set, Map).

--

## 📌 Chain of Responsibility Pattern
The **Chain of Responsibility** is to pass requests along a chain of handlers to proceed next handler.

--

## 📌 Visitor Pattern
The **Visitor Pattern** is to add new functionality to a group of similar classes without actually modifying the code of those classes.

