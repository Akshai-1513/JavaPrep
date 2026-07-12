# Java LTS Versions Comparison

Java has several **LTS (Long-Term Support) versions**. These versions receive **long-term bug fixes, security updates, and enterprise support**, so companies usually build production systems on them.

The major Java LTS versions are:

- **Java 8 (2014)**
- **Java 11 (2018)**
- **Java 17 (2021)**
- **Java 21 (2023)**

Below is a **clear comparison of what changed between each LTS version**.

---

# 1. Java 8 (2014) – Functional Programming Introduction

This was one of the **biggest Java releases ever**.

## Major Features

### 1. Lambda Expressions
Write functions in a shorter way.

```java
    list.forEach(x -> System.out.println(x));
```

### 2. Stream API
Functional data processing (`map`, `filter`, `reduce`).

```java
list.stream().filter(x -> x > 10).forEach(System.out::println);
```

### 3. Functional Interfaces
Interfaces with a single abstract method.

```java
Runnable r = () -> System.out.println("Running");
```

### 4. Default Methods in Interfaces
Interfaces can now have method implementations.

### 5. New Date & Time API
Examples:
- `LocalDate`
- `LocalTime`
- `LocalDateTime`

### 6. Optional Class
Helps avoid `NullPointerException`.

---

# 2. Java 11 (2018) – Modernization and Performance

Focused on **performance improvements and new utilities**.

## Major Features

### 1. New String Methods

```java
str.isBlank();
str.lines();
str.repeat(3);
```

### 2. New HTTP Client API
Modern HTTP requests.

```java
HttpClient client = HttpClient.newHttpClient();
```

### 3. Run Java Files Without Compilation

```bash
java Test.java
```

### 4. Local Variable Syntax in Lambda

```java
(var x, var y) -> x + y
```

### 5. Garbage Collector Improvements

### 6. Removal of Older Modules
- Java EE
- CORBA

---

# 3. Java 17 (2021) – Stability + Language Improvements

Very popular in **enterprise development today**.

## Major Features

### 1. Sealed Classes
Restrict which classes can extend a class.

```java
public sealed class Shape permits Circle, Square {}
```

### 2. Pattern Matching for `instanceof`

**Old way**

```java
if(obj instanceof String) {
    String s = (String) obj;
}
```

**New way**

```java
if(obj instanceof String s) {
    System.out.println(s);
}
```

### 3. Improved Random Number Generator

### 4. New macOS Rendering Pipeline

### 5. Security and Performance Improvements

---

# 4. Java 21 (2023) – Modern Java & Concurrency

Latest **LTS version** with major improvements in **concurrency and pattern matching**.

## Major Features

### 1. Virtual Threads (Project Loom)

Massively improves concurrency.

```java
Thread.startVirtualThread(() -> {
    System.out.println("Hello");
});
```

Instead of thousands of OS threads, Java can create **millions of lightweight threads**.

---

### 2. Pattern Matching for `switch`

```java
switch(obj) {
    case String s -> System.out.println(s);
}
```

---

### 3. Record Patterns

Better pattern matching for records.

```java
if (obj instanceof Point(int x, int y)) {
}
```

---

### 4. Sequenced Collections
New interfaces for ordered collections.

---

### 5. String Templates (Preview)
Simplifies string formatting.

---

# Key Differences Between LTS Versions

| Feature | Java 8 | Java 11 | Java 17 | Java 21 |
|--------|--------|--------|--------|--------|
| Lambda Expressions | ✔ | ✔ | ✔ | ✔ |
| Stream API | ✔ | ✔ | ✔ | ✔ |
| New String Methods | ✖ | ✔ | ✔ | ✔ |
| HTTP Client | ✖ | ✔ | ✔ | ✔ |
| Sealed Classes | ✖ | ✖ | ✔ | ✔ |
| Pattern Matching | ✖ | ✖ | ✔ | ✔ (advanced) |
| Virtual Threads | ✖ | ✖ | ✖ | ✔ |
| Record Patterns | ✖ | ✖ | ✖ | ✔ |

---

# Real-World Usage

Typical company usage today:

- **Legacy systems** → Java 8
- **Stable enterprise apps** → Java 11
- **Modern enterprise apps** → Java 17
- **Cutting-edge systems** → Java 21

---

# Simple Interview Answer

Java LTS versions provide long-term support for enterprise systems.

Major LTS versions include **Java 8, Java 11, Java 17, and Java 21**.

- **Java 8** introduced Lambda expressions and Stream API.
- **Java 11** added HTTP client and new String methods.
- **Java 17** introduced sealed classes and pattern matching.
- **Java 21** introduced virtual threads and advanced pattern matching.