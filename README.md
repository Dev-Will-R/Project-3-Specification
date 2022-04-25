# Project-3-Specification
By Zac Neuhardt and Will Rodriguez

Simple implementations of the Bridge, Observer, and Visitor design patterns.

Made for LUC COMP 373 Project 3

## Pattern Descriptions

### Bridge pattern
	Using the bridge pattern allowed the abstraction and implementation to be separated. This means that, since they are functioning independently, they can both vary and be changed independently, allowing for better separation of concerns and independence. 

### Observer pattern
	The observer pattern allows multiple items to be updated by simply updating one which they are observing. Using one class in Subject, the rest of the classes are able to update simply by ‘observing’ the Subject class, allowing for a more streamlined process.

### Visitor pattern
	The visitor pattern allows the code to adhere to the Open/Closed Principle: By modularizing the code to components that use each other, new behaviors can be added without modifying certain parts of the code directly. This allows the code to be open for extension, and closed for modification
