package simple_factory_pattern;

public class AdidasShoeFactory extends ShoeFactory{
  @Override
  public Shoe createShoe() {
    return new AdidasShoe();
  }
}
