package simple_factory_pattern;

import java.util.List;

public class App {

  public  static void main(String[] args) {

    // Example of the (simple) factory method pattern
    ShoeFactory adidasShoeFactory = new AdidasShoeFactory();
    Shoe adidasShoes = adidasShoeFactory.orderShoe();
    adidasShoes.prepare(); // This would be the same thing that orderShoe would already do
    ShoeFactory nikeShoeFactory = new NikeShoeFactory();
    nikeShoeFactory.orderShoe();

    // Add another implementation in the abstract class where I can order a certain amount of shoes
    List<Shoe> basketBallShoes =  nikeShoeFactory.orderBatchOfShoes(50);
    // You could also easily use polymorphisme and cast this into a different kind of shoe.
    List<AdidasShoe> adidasShoes1 = basketBallShoes.stream()
        .filter(shoe -> shoe instanceof AdidasShoe)
        .map(shoe -> (AdidasShoe) shoe)
        .toList();
  }
}
