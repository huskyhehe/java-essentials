# java-essentials

## Generics
### Generic Classes
- single type parameter
- multi type parameters
- bounded type parameters
- wildcard
### Generic methods

Note:
- Generics does not work with primitive types (int, float, char, etc).
- When a generic method returns a generic type, we should use a type parameter instead of a wildcard:

## Functional Programming
### Lambda
- SAM Functional Interface (Single Abstract Method)
- Generic Functional Interface
### Stream
Stream Operations:
1. Creating Streams
  - concat()
  - empty()
  - generate()
  - iterate()
  - of()
2. Intermediate Operations
  - filter()
  - map()
  - flatMap()
  - distinct()
  - sorted()
  - peek()
  - limit()
  - skip()
3. Terminal Operations
  - forEach()
  - forEachOrdered()
  - toArray()
  - reduce()
  - collect()
  - min()
  - max()
  - count()
  - anyMatch()
  - allMatch()
  - noneMatch()
  - findFirst()
  - findAny()