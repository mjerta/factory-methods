package simple_factory_method;

import java.util.List;
import java.util.stream.Collectors;

public class App {

  public  static void main(String[] args) {

    // Example of the (simple) factory method pattern
    ShoeFactory runningShoeFactory = new RunningShoeFactory();
    Shoe runningshoe = runningShoeFactory.orderShoe();
    runningshoe.prepare(); // This would be the same thing that orderShoe would already do
    ShoeFactory basketBallShoeFactory = new BasketBallFactory();
    basketBallShoeFactory.orderShoe();

    // Add another implementation in the abstract class where I can order a certain amount of shoes
    List<Shoe> basketBallShoes =  basketBallShoeFactory.orderBatchOfShoes(50);
    // You could also easily use polymorphisme and cast this into a different kind of shoe.
    List<RunningShoe> runningShoes = basketBallShoes.stream()
        .filter(shoe -> shoe instanceof RunningShoe)
        .map(shoe -> (RunningShoe) shoe)
        .toList();
  }
}
