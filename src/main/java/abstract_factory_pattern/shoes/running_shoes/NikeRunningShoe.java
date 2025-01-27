package abstract_factory_pattern.shoes.running_shoes;

public class NikeRunningShoe implements RunningShoe {
  @Override
  public void prepare() {
    System.out.println("The Nike running shoe has been prepared.");
  }
}
