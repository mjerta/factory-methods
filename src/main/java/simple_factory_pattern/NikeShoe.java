package simple_factory_pattern;

public class NikeShoe implements Shoe{
  @Override
  public void prepare() {
    System.out.println("The Nike shoe has been prepared.");
  }
}
