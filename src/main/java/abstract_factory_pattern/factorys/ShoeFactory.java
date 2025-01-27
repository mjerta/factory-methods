package abstract_factory_pattern.factorys;

import abstract_factory_pattern.shoes.basketball_shoes.BasketBallShoe;
import abstract_factory_pattern.shoes.running_shoes.RunningShoe;
import simple_factory_pattern.Shoe;

import java.util.ArrayList;
import java.util.List;

abstract public class ShoeFactory {
  // own implementation, this will create and prepare the shoe at the same time.
  // Business logic


  public RunningShoe orderRunningShoe() {
    RunningShoe shoe = createRunningShoe();
    shoe.prepare();
    return shoe;
  }

  public List<RunningShoe> orderBatchOfRunningShoes(Integer amount) {
    List<RunningShoe> shoes = new ArrayList<>();
    for (int i = 0; i < amount; i++) {
      RunningShoe shoe = createRunningShoe();
      shoe.prepare();
      shoes.add(shoe);
    }
    return shoes;
  }

  public BasketBallShoe orderBasketBallShoe() {
    BasketBallShoe shoe = createBasketBallShoe();
    shoe.prepare();
    return shoe;
  }

  public List<BasketBallShoe> orderBatchOfBasketBallShoes(Integer amount) {
    List<BasketBallShoe> shoes = new ArrayList<>();
    for (int i = 0; i < amount; i++) {
      BasketBallShoe shoe = createBasketBallShoe();
      shoe.prepare();
      shoes.add(shoe);
    }
    return shoes;
  }

  abstract public RunningShoe createRunningShoe();
  abstract public BasketBallShoe createBasketBallShoe();
}