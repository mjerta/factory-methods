package abstract_factory_pattern;

import abstract_factory_pattern.factorys.AdidasShoeFactory;
import abstract_factory_pattern.factorys.NikeShoeFactory;
import abstract_factory_pattern.factorys.ShoeFactory;

public class App {

  public  static void main(String[] args) {

    // Example of the (simple) factory method pattern


    // note of abtract factory method:
    // Abstract factory pattern suggest to explicitly declare interfaces for each distinct product we have
    ShoeFactory adidasShoeFactory = new AdidasShoeFactory();
    adidasShoeFactory.orderRunningShoe();
    adidasShoeFactory.orderBasketBallShoe();
    adidasShoeFactory.orderBatchOfRunningShoes(2);
    adidasShoeFactory.orderBatchOfBasketBallShoes(2);
    System.out.println();
    ShoeFactory nikeShoeFactory = new NikeShoeFactory();
    nikeShoeFactory.createRunningShoe();
    nikeShoeFactory.createBasketBallShoe();
    nikeShoeFactory.orderBatchOfRunningShoes(2);
    nikeShoeFactory.orderBatchOfBasketBallShoes(2);
  }
}
