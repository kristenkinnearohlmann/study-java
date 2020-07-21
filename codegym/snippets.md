# Snippets for Java

## Declare a new object
VariableType variableName = new TypeOfObjectBeingCreated();

## Abstraction
- One of the four basic principles of object-oriented programming.
- Extracting the most important and significant characteristics of an item and casting aside those that are minor or insignificant.

## Constructors
- Template for objects of a class.
- Same name as the class.
- Not static - needed for instances rather than class.
- Does not require a return value (no void, no object type).
- Even if a constructor is not declared, the default constructor will be called; it is eliminated once you create a constructor with arguments.
- If a no argument constructor is needed along with argument constructors, it needs to be explicitly declared.
- Values can be assinged directly within the constructor, they don't have to be only passed in.

## this keyword
- Indicates a particular object.

## Methods
- Use of the term **method** is accepted for Java (instead of function as some other languages use).
- Use **return** keyword in methods.

## Misc
- Class member variables are also called fields.
- Keyword **static** means the object belongs to the class, not an instance of the class.
- Primitives pass by value, not by reference; can't change value implicitly.