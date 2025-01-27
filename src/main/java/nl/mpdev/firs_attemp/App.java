//The factory pattern allows you to abstract the complexity of object creation (like size, material, or brand logic) inside the factory.
// You just call a simple method like createRunningShoe(), and it’s done.
// You don’t care about how the object is created, and the logic is centralized.
// It avoids clutter in the main method. Therefor factory methods can be change without changing the client(main)

package nl.mpdev.firs_attemp;

// This could be as well an abstract class if there is a certain constructor is needed
//interface Shoe {
//  void wear();
//}

import java.util.List;

abstract class Shoe {
  private String size;
  private String color;

  public Shoe() {
  }

  public Shoe(String size, String color) {
    this.size = size;
    this.color = color;
  }

  @Override
  public String toString() {
    return "Shoe{" +
      "size='" + size + '\'' +
      ", color='" + color + '\'' +
      '}';
  }

  abstract void wear();
}

class AdidasRunningShoe extends Shoe {

  public AdidasRunningShoe() {
  }

  public AdidasRunningShoe(String size, String color) {
    super(size, color);
  }

  @Override
  public void wear() {
    System.out.println("Wearing Adidas running shoes!");
  }

  public void extraInfo() {
    System.out.println("Some extra info!");
  }
}

class AdidasSkateBoardShoe extends Shoe {
  public AdidasSkateBoardShoe() {
  }

  public AdidasSkateBoardShoe(String size, String color) {
    super(size, color);
  }

  @Override
  public void wear() {
    System.out.println("Wearing Adidas skateboard shoes!");
  }
}

class AdidasBasketBallShoe extends Shoe {

  public AdidasBasketBallShoe() {
  }

  public AdidasBasketBallShoe(String size, String color) {
    super(size, color);
  }

  @Override
  public void wear() {
    System.out.println("Wearing Adidas basketball shoes!");
  }

  public void extraInfo() {
    System.out.println("Some extra info!");
  }

}

// This could in theory also be an abstract or an interface class for this case. Then you could still add an own default implementation
// to it.
abstract class ShoeFactory {

  public Shoe wearRunningShoe() {
    Shoe shoe = createRunningShoe();
    shoe.wear();
    return  shoe;
  }

  public abstract AdidasRunningShoe createRunningShoe();

  public abstract Shoe createRunningShoeWithSomeExtraDetails();

  public abstract Shoe createSkateBoardShoe();

  public abstract Shoe createBasketBallShoe();

  public abstract List<Shoe> creatingAllShoesWithDetails();
}

class ShoeFactoryAnotherExample {
  public AdidasRunningShoe createRunningShoe() {
    return new AdidasRunningShoe();
  }
}

class AdidasFactory extends ShoeFactory {

  // This is the factory method
  @Override
  public AdidasRunningShoe createRunningShoe() {
    // In theory you could add more logic inside of this and even perhaps create different instances and pass it down into the
    // constructor if it can contain those arguments.
    return new AdidasRunningShoe();

  }

  @Override
  public Shoe createRunningShoeWithSomeExtraDetails() {
    return new AdidasRunningShoe("Large", "Red");
  }

  @Override
  public Shoe createSkateBoardShoe() {
    return new AdidasSkateBoardShoe();
  }

  @Override
  public Shoe createBasketBallShoe() {
    return new AdidasBasketBallShoe();
  }

  @Override
  public List<Shoe> creatingAllShoesWithDetails() {
    return List.of(
      new AdidasRunningShoe("Large", "Red"),
      new AdidasSkateBoardShoe("Small", "Green"),
      new AdidasBasketBallShoe("Medium", "Blue")
    );
  }
}

public class App {
  public static void main(String[] args) {

    ShoeFactory adidasFactory = new AdidasFactory();
    Shoe adidasSkateBoardShoe = adidasFactory.createSkateBoardShoe(); // Factory method being used
    adidasSkateBoardShoe.wear();
    AdidasRunningShoe adidasRunningShoe = adidasFactory.createRunningShoe();
    adidasRunningShoe.wear();
    Shoe adidasBasketBallShoe = adidasFactory.createBasketBallShoe();
    adidasBasketBallShoe.wear();

    // If i want to make use of a certain method inside the specific class I could use casting for this
    // This is a solution however this is not great for flexibility or extending functionaility in the future. Helper classes, visitor
    // patterns or strategy pattern could be a potential alternative(as I found out online)
    if (adidasBasketBallShoe instanceof AdidasBasketBallShoe) {
      AdidasBasketBallShoe adidasShoe = (AdidasBasketBallShoe) adidasBasketBallShoe;
      adidasShoe.extraInfo();
    }

    // Another way would be to have the return type to be the one of the specific class.
    // When using an abstract class as a factory like this this would kind of defeat the purpose of having this abstract class.
    adidasRunningShoe.extraInfo();
    // You could rather use the method directly inside the abstract class like so
    ShoeFactoryAnotherExample shoeFactoryAnotherExample = new ShoeFactoryAnotherExample();
    AdidasRunningShoe adidasRunningShoeAnotherExample = shoeFactoryAnotherExample.createRunningShoe();
    adidasRunningShoeAnotherExample.extraInfo();
    // However it seems like when you make the return type of the abstraction/interface of Shoe it would make more sense since you have
    // more flexibility and can use polymorphism.

    // This is what chatGPT is providing me:
    // While this is possible, it kind of goes against the core idea of the Factory Pattern, which is to provide an abstraction for the
    // creation of objects.
    // The factory method is supposed to hide the complexity of object creation and provide flexibility in returning different types of
    // shoes without exposing the concrete classes to the client code.

    // You should avoid "baking" a specific class into the factory, because it reduces extensibility.
    // The whole point of the factory is to abstract the instantiation details and allow for future changes (e.g., adding new shoe types)
    // without changing the client code.

    // Factory method then is being where the subclass derives it constructor from its abstract class
    Shoe adidasShoeWithSomeDetails = adidasFactory.createRunningShoeWithSomeExtraDetails();
    System.out.println(adidasShoeWithSomeDetails.toString());

    // Example of a list returning from the the factory
    adidasFactory.creatingAllShoesWithDetails().forEach((shoe) -> System.out.println(shoe.toString()));

    adidasFactory.wearRunningShoe();
  }
}
