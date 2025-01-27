package simple_factory_method;

public class RunningShoeFactory extends ShoeFactory{
  @Override
  public Shoe createShoe() {
    return new RunningShoe();
  }
}
