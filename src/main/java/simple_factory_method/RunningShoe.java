package simple_factory_method;

public class RunningShoe  implements Shoe{
  @Override
  public void prepare() {
    System.out.println("The running shoe has been prepared.");
  }
}
