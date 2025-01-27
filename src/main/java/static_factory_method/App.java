package static_factory_method;

public class App {
  public static void  main(String[] args) {


    // Advantages over using factory methods over constructors
    // Static factory methods can have meaningful names
    // Static factory methods can return the same type that implements the method(s), a subtype, and also primitive
    // Static factory methods can encapsulate all the logic required for pre-constructing fully initialized instances
    // Static factory methods can be controlled-instanced methods, like for example with the Singleton pattern

    // It removes logic out of Constructors. With is a best practice: Single Responsibility Principle

    // The main disadvantage is that classes without public or protected constructors can not be subclassed



    // A static factory method is a static method in a class that returns an instance of that class (or a related class)
    // and provides an alternative to using constructors for object creation.

    Shoe redshoe = Shoe.createBigRedShoe(Size.EU_50);
    // To String call is not necessary in println
    System.out.println(redshoe);

    Shoe redShoeWIthLogger = Shoe.createBigRedSHoeWithLoggedInstantiaionTime(Size.EU_37);
    System.out.println(redShoeWIthLogger);

  }
}
