package abstract_factory_pattern.factorys;

import abstract_factory_pattern.shoes.basketball_shoes.BasketBallShoe;
import abstract_factory_pattern.shoes.basketball_shoes.NikeBasketBallShoe;
import abstract_factory_pattern.shoes.running_shoes.NikeRunningShoe;
import abstract_factory_pattern.shoes.running_shoes.RunningShoe;

public class NikeShoeFactory extends ShoeFactory {

  @Override
  public RunningShoe createRunningShoe() {
    return new NikeRunningShoe();
  }

  @Override
  public BasketBallShoe createBasketBallShoe() {
    return new NikeBasketBallShoe();
  }
}
