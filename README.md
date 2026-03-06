# Gang of Four (GoF)

---

# 1. Creational Design Patterns
 -  Singleton Pattern

---

## 📌 Singleton Pattern - Project Overview
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
