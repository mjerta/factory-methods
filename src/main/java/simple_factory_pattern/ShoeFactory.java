package simple_factory_pattern;

import java.util.ArrayList;
import java.util.List;

abstract public class ShoeFactory {
  // own implementation, this will create and prepare the shoe at the same time.
  public Shoe orderShoe() {
    Shoe shoe = createShoe();
    shoe.prepare();
    return shoe;
  }

  public List<Shoe> orderBatchOfShoes(Integer amount) {
    List<Shoe> shoes = new ArrayList<>();
    for(int i = 0; i <= amount; i++) {
      Shoe shoe =  createShoe();
      shoe.prepare();
      shoes.add(shoe);
    }
    return shoes;
  }

  abstract public Shoe createShoe();
}