package simple_factory_method;

public class BasketBallShoe implements Shoe{
  @Override
  public void prepare() {
    System.out.println("The basketball shoe has been prepared.");
  }
}
