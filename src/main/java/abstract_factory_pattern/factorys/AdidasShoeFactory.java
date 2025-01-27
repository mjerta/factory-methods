package abstract_factory_pattern.factorys;

import abstract_factory_pattern.shoes.basketball_shoes.AdidasBasketBallShoe;
import abstract_factory_pattern.shoes.running_shoes.AdidasRunningShoe;
import abstract_factory_pattern.shoes.basketball_shoes.BasketBallShoe;
import abstract_factory_pattern.shoes.running_shoes.RunningShoe;

public class AdidasShoeFactory extends ShoeFactory {
  @Override
  public RunningShoe createRunningShoe() {
    return new AdidasRunningShoe();
  }

  @Override
  public BasketBallShoe createBasketBallShoe() {
    return new AdidasBasketBallShoe();
  }
}
