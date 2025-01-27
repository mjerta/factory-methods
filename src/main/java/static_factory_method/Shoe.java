package static_factory_method;

import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Shoe {

  private static Logger LOGGER = Logger.getLogger(Shoe.class.getName());
  private String color;
  private int size;

  private Shoe(String color, int size) {
    this.color = color;
    this.size = size;
  }

  public static Shoe createBigRedShoe(Size size) {
    return new Shoe("Red", size.getSize());
  }

  public static Shoe createBigRedSHoeWithLoggedInstantiaionTime(Size size) {
    LOGGER.log(Level.INFO, "Creating shoe instance at : {0}", LocalTime.now());
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
