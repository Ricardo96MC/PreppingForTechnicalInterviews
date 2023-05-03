## C# Interview Questions and Answers

1.  What are the fundamentals of OOP
    
    1.  **Encapsulation**: When an objects internal representation is hidden from view outside, it is said to be encapsulated. Only the necessary information is accessible, while the rest of the data implemented is hidden.
        It does so by preventing access to implementation details. Encapsulation is implemented by using access specifiers. An access specifier defines the scope and visibility of a class member. C# supports the following access specifiers:
        - **Public**: Public access specifier allows a class to expose its member variables and member functions to other functions and objects. Any public member can be accessed from outside the class.
        - **Private**: Private access specifier allows a class to hide its member variables and member functions from other functions and objects. Only functions of the same class can access its private members. Even an instance of a class cannot access its private members.
        - **Protected**: Protected access specifier allows a child class to access the member variables and member functions of its base class. This way it helps in implementing inheritance.
        - **Internal**: Internal access specifier allows a class to expose its member variables and member functions to other functions and objects in the current assembly. In other words, any member with internal access specifier can be accessed from any class or method defined within the application in which the member is defined.
        - **Protected Internal**: The protected internal access specifier allows a class to hide its member variables and member functions from other class objects and functions, except a child class within the same application. This is also used while implementing inheritance.
    2.  **Abstraction**: Is the process of identifying and eliminating irrelevant details from an objects critical behavior and data
        Abstraction can be achieved with either abstract classes or interfaces.
        An abstract class can also be thought of as "incomplete class" as in it needs to be inherited in order for it be complete. For example you want a user to pick a type vehicle(car, truck, boat, bike) not a generic no type vehicle. So you can use the abstract keyword in order to prevent it from being instantiated to begin with. As or a function that is abstract it is body-less that is then used and defined within the class that inherits it (View the animal class photo).
        The abstract keyword is used for classes and methods:
        - **Abstract class:** is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
        - **Abstract method**: can only be used in an abstract class, and it does not have a body. The body is provided by the derived class (inherited from).
        IMAGE HERE
    3.  **Inheritance**: The ability to create new classes from existing ones. It is accomplished by gaining access to, altering and extending the behavior of objects in the parent class.
        IMAGE HERE
    4.  **Polymorphism**: "One name, many forms". It is accomplished using several methods with the same name but differnt implementations
        IMAGE HERE
        Look at the above how both the Pig and Dog class inherit from animal. Animal has a base fucntion that is "**virtual**" therefore it can be overriden. This allows us to implement our own version of **animalSound()** from the child classes. While still using the same definition.
2.  What is the common Language Runtime (CLR)
    
    1.  This manages the .NET programs. The just in time compilier translates compiled code into machine instructions. This is the program that the computer runs. CLR provides memory management, exception handling, type safety, and other services.
3.  What is an interface?
    
    1.  It is a class blueprint. It is like an abstract class in that all the methods declared within the interface are abstract. It cannot have a method body and cannot be instantiated. Instead it is used to achieve multiple inheritances that cant reach.
4.  What are the different types of classes?
    
    1.  **Partial Class**: Its members can be divided or shared across multiple files.
        1.  Multiple Developer Using Partial Classes multiple developer can work on the same class easily.
        2.  Code Generator Partial classes are mainly used by code generator to keep different concerns separate
        3.  Partial Methods Using Partial Classes you can also define Partial methods as well where a developer can simply define the method and the other developer can implement that.
        4.  Partial Method Declaration only Even the code get compiled with method declaration only and if the implementation of the method isn't present compiler can safely remove that piece of code and no compile time error will occur
    2.  **Abstract Class**: Cannot be instantiated. The only way to get the class is to inherit it. It must include at least one method.
    3.  **Sealed Class**: Is a class that cannot be inherited by any class but can be instantiated. The design intent of a sealed class is to indicate that the class is specialized and there is no need to extend it to provide any additional functionality through inheritance to override its behavior.
    4.  **Static Class**: This class does not allow inheritance. The class's members are also static. The keyword static denotes this. This keyword instructs the compiler to look for any instances of the static class created by accident.
5.  What is the difference between "==" and the .Equals() method?
    
    1.  The equality operator == checks whether two operands are equal or not, and the Object. Equals() method checks whether the two object instances are the same.
6.  Explain code compilation.
    
    1.  In c# there are three steps. the compiler compiles the code into Managed code. It then puts the newly created code into assemblies. And lastly the CLR is being loaded, and the CLR is carrying out the assembly.
7.  What is the difference between Interface and Abstract Class in C#?
    
    - An **abstract class** can contain both **DECLARATION and DEFINITION** of methods.
        - An **Interface** should contain **ONLY the DECLARATION **of methods.
    - Abstract class does not support multiple inheritance
    - A class can implement any number of interfaces, but a subclass can, at most, use only one abstract class.
    - An abstract class can have non-abstract methods (concrete methods), while in the case of interface, all the methods have to be abstract.
        An abstract class can declare or use any variables, while an interface cannot do so.
    - In an abstract class, all data members or functions are private by default, while in an interface, all are public; we can’t change them manually.
    - In an abstract class, we need to use abstract keywords to declare abstract methods; in an interface, we don’t need that.
    - An abstract class can’t be used for multiple inheritance, while the interface can be used for multiple inheritance.
    - An abstract class uses a constructor, while we don’t have any constructor in an interface.
8.  When to use interfaces and when to use an Abstract class
    
    1.  **Interface: **An interface is a a good choice when you know a method as to be there, but it can be implemented **DIFFERENTLY** by an independent derived classes.
    2.  **Abstract: **An abstract class is a good choice when you are sure some methods are concrete/defined and must be implemented in the **SAME WAY** in all derived classes.
9.   **IEnumerable vs IQueryable**
    - - IQueryable is suitable for querying data from out-memory (like remote database, service) collections. Whereas IEnumerable is good for In-Memory Collection query.
        - IEnumerable doesn’t support lazy loading. Hence not suitable for paging like scenarios. Whereas Iqueryable support lazy loading and suitable for paging like senearios.
        - So if you working with only in-memory data collection IEnumerable is a good choice but if you want to query data collection which is connected with database IQueryable is a better choice as it reduces network traffic and uses the power of SQL language.        IMAGE HERE

        IMAGE HERE
        - IQueryable interface inherits from IEnumerable, so whatever IEnumerable can do, IQueryable can also do
    - Lazy loading vs eager loading:
        - While lazy loading delays the initialization of a resource, eager loading initializes or loads a resource as soon as the code is executed. Eager loading also involves pre-loading related entities referenced by a resource.
        - Eager loading is a Process where Entity Framework loads the related entities along with the main entity. That means, in this case, Entity Framework will not execute separate SQL queries for loading the related entities. So, all the entities are loaded from the database with a single query and hence saving bandwidth and server CPU time. Entity Framework use JOINs to load the related entities.
        - Lazy Loading is a Process where Entity Framework loads the related entities on demand. Lazy Loading is the default behavior of Entity Framework. That means the related entities or child entities are loaded only when it is being accessed for the first time. That means in simple words we can say that Lazy loading simply delays the loading of related entities until you specifically request it.
        - The one and only difference is loading the related entities. In Eager loading, all the related entities are loaded while loading the Main entity and on the other hand, with Lazy Loading, the related entities are going to be loaded on demand i.e. when required or when accessing the navigation property of the Main entity at that time only the related entities are going to be loaded from the database