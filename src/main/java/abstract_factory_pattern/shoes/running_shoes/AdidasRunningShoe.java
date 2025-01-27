package abstract_factory_pattern.shoes.running_shoes;

public class AdidasRunningShoe implements RunningShoe {
  @Override
  public void prepare() {
    System.out.println("The Adidas running shoe has been prepared.");
  }
}
