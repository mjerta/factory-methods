package static_factory_method;

public class Shoe {

  private String color;
  private int size;

  private Shoe(String color, int size) {
    this.color = color;
    this.size = size;
  }

  public static Shoe createBigRedShoe(Size size) {
    return new Shoe("Red", size.getSize());
  }

  @Override
  public String toString() {
    return "Shoe{" +
      "color='" + color + '\'' +
      ", size=" + size +
      '}';
  }
}
