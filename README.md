Student Management System

## Design Patterns Used
### 1.Builder design pattern:The Builder pattern was implemented in the 'UndergraduateStudent' and 'GraduateStudent classes.
-Since students have many attributes (ID, Name, Email, Dept, Hours, etc.), using a standard constructor would be messy and confusing.
When implemented each student class contains a static nested `Builder` class that allows for "fluent" object creation.

## SOLID Principles Applied

### 1. Single Responsibility Principle (SRP)
Each class in this project has a single, well-defined responsibility:
- The **Student** subclasses (Undergraduate/Graduate) are responsible only for holding student data and calculating tuition.
- The **Builder** classes are responsible solely for the complex construction of these student objects.
- The **Main** class handles only the execution and display logic.
*Reference:* See how `UndergraduateStudent` handles logic while its nested `Builder` handles the setup.

### 2. Open/Closed Principle (OCP)
The design is open for extension but closed for modification. 
- We can easily add a new student type, such as `PartTimeStudent` or `InternationalStudent`, by simply extending the `Student` abstract class. 
- Adding these new types does not require us to change the existing `Student`, `UndergraduateStudent`, or `GraduateStudent` classes.
*Reference:* The `Student` abstract class provides a stable contract that all future student types can follow without breaking existing code.
