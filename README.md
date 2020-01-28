# Design Patterns
 - https://www.journaldev.com/1827/java-design-patterns-example-tutorial
## Creational Patterns
   - **Singleton Pattern** : Pattern to instantiate object once. 
   - **Factory pattern**: Instead of directly invoking object, use factory class by passing the type. The objects created by factory belong to same superclass. Factory class will have the logic to instantiate the class.
   - **Abstract Factory pattern**: Instead of having the instantiation in Factory class. Have Abstract factories for each type of sub classes. Facotry will only redirect to appropriate abstract factory class based on type. Abstract factory class will take care of instantiating object.
   - **ProtoType Desgin pattern**: Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. Prototype design pattern uses java cloning to copy the object. 
   - **Builder Pattern**: Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method that will actually return the final Object. 
   
## Structural Design Patterns
   - **Adapter Pattern**:The adapter design pattern is one of the structural design patterns and it’s used so that two unrelated interfaces can work together. 
   - **Composite Pattern**: When we need to create a structure in a way that the objects in the structure have to be treated the same way, we can apply the composite design pattern.
   - **Proxy Design pattern**: It is used when we want controlled access to a functionality.
   - **Flyweight Pattern**: Flyweight design pattern is used when we need to create a lot of Objects of a class.flyweight design pattern can be applied to reduce the load on memory by sharing objects. 
   - **Facade Pattern**: Provide a unified interface to a set of interfaces in a subsystem. Facade Pattern defines a higher-level interface that makes the subsystem easier to use.
   - **Bridge Pattern**:  When we have interface hierarchies in both interfaces as well as implementations, then bridge design pattern is used to decouple the interfaces from implementation and hiding the implementation details from the client programs. 
   - **Decorator Pattern**: The decorator design pattern is used to modify the functionality of an object at runtime. It is like linked list:)
   
## Behavioural Deisgn Patterns
  - **Template Method Pattern**:Template method defines the steps to execute an algorithm and it can provide a default implementation that might be common for all or some of the subclasses.
  - **Chain of Responsibility Pattern**: Chain of responsibility pattern is used to achieve loose coupling in software design where a request from the client is passed to a chain of objects to process them. Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
 - **Observer Pattern**: In observer pattern, the object that watch on the state of another object are called Observer and the object that is being watched is called Subject. (Listener of an event)
 - **Strategy Pattern**: Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
 - **Command Pattern**: is used to implement lose coupling in a request-response model. In command pattern, the request is send to the invoker and invoker pass it to the encapsulated command object. Command object passes the request to the appropriate method of Receiver to perform the specific action.
 - **Visitor Pattern**: Visitor pattern is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class. Ex: Shopping cart different items price calculation.
