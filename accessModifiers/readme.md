# Java Access Modifiers

## Public

Public access modifier allows a class, method, or variable to be accessible from any other class in the program. It is the most permissive access level and is commonly used when you want to expose functionality to all parts of the application. Can be accessed from anywhere within the same program.

## Private

Available only to the class where it is created. This is not accessible to classes within the same package or any other part of the program except the class itself.

## Protected

This modifier makes the method, class or variable accessible to the class itself, classes within the same package and to its subclasses i.e. classes inherited from the class where the variable or method declaration has been modified with the Protected keyword.

## Best Practices

- Use the most restrictive access level that still allows your code to function correctly. This helps to maintain encapsulation and reduces the risk of unintended interactions between classes.
- One class per file is a good practice. It improves readability and makes it easier to manage code changes.
- You should only have one public class in a file.
- Avoid using public variables unless absolutely necessary.
- Avoid declaring methods or variables without the proper acceess modifier.
- Comment your code effectively to explain the purpose of classes and methods.
