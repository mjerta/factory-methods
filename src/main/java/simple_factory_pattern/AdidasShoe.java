package simple_factory_pattern;

public class AdidasShoe implements Shoe{
  @Override
  public void prepare() {
    System.out.println("The Adidas shoe has been prepared.");
  }
}
