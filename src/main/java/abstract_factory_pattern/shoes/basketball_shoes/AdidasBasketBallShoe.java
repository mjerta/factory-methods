package abstract_factory_pattern.shoes.basketball_shoes;

public class AdidasBasketBallShoe implements BasketBallShoe {

  @Override
  public void prepare() {
    System.out.println("The Adidas basketBall shoe has been created");
  }
}
