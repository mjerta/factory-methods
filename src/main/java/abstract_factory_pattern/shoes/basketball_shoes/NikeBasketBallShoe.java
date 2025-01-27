package abstract_factory_pattern.shoes.basketball_shoes;

public class NikeBasketBallShoe implements BasketBallShoe {
  @Override
  public void prepare() {
    System.out.println("The Nike basketball shoe has been prepared");
  }
}
