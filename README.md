# generic-package [![Build Status](https://travis-ci.org/timtim17/generic-package.svg?branch=master)](https://travis-ci.org/timtim17/generic-package)
A wrapper class to store a generic Java Object and its original type.

## Usage
An `List` in Java holds one type of Object. But, what if you want to hold more than one type of object? Well, you could make an `List<Object>`, but then getting an object would only return a generic `Object`. You'd then have to somehow determine what type of object it should be casted to.

```java
List<Object> list = new ArrayList<>();
list.add("Test");
list.add(new Integer(5));

// ...

for (Object o : list) {
    Integer converted = (Integer) o; // Doesn't work for the String
}
```

Instead, `Package` is basically a wrapper for `Object`. It stores both its value as an `Object` and what type it should be casted to, as well as a method to convert it back.

```java
List<Package<?>> list = new ArrayList<>();
list.add(new Package("Test"));
list.add(new Package(new Integer(5)));

// ...

String test = list.get(0).getValue();
```

## Practicality
In the real world, this scullion isn't very practical. There are other, better ways built into Java that can solve this issue, and this solution isn't that well thought out either. This is just a random idea that I came up with when I was bored and decided to implement for practice.
