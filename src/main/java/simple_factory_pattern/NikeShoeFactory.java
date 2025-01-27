package simple_factory_pattern;

public class NikeShoeFactory extends ShoeFactory{

  @Override
  public Shoe createShoe() {
    return new NikeShoe();
  }
}
