# java8 default and static methods in interface
In this section, we’ll learn how to use static and default methods in interfaces, and discuss some situations where they can be useful.

# default methods
default keyword is only allowed in interfaces, if we try to use in classes it gives us compile time error.
In a typical design based on abstractions, where interface has one or multiple implementations, if we try to add a method or two then all the implementations are forced implement them.
To overcome this problem default methods introduced where we can define the default methods in interfaces to provide a common util functionality across all the implementations.

There is a diamond problem also associated with default methods.

# Diamond problem

When a class implements multiple interfaces where more than one interface holds a default method with same name.

For eg, If we have two interfaces namely MyInterface & YourInterface. They both have a default method namely test, If a class implements both these interfaces then what will happen if i try to invoke a default method with this class instance. The compiler finds it difficult to identify from which interface it should invoke the default method.

To avoid this, When a class implements multiple interfaces with same default method name it must override the default method in it and we can define which interface method it should call with the following syntax.

MyInterface.super.display();

# static methods

static methods in interface holds the entire static method definition inside the interface itself.
So since static methods can not be overridden we must invoke them by interface name.

For eg, MyInterface.display();

You can refer the source code where i have provided examples for static and default methods implementation in interfaces