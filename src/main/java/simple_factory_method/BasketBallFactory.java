package simple_factory_method;

public class BasketBallFactory extends ShoeFactory{

  @Override
  public Shoe createShoe() {
    return new BasketBallShoe();
  }
}
