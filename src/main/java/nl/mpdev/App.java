package nl.mpdev;

interface Shoe {
  void wear();
}

class AdidasRunningShoe implements Shoe {

  @Override
  public void wear() {
    System.out.println("Wearing Adidas running shoes!");
  }
}

class AdidasSkateBoardShoe implements Shoe {
  @Override
  public void wear() {
    System.out.println("Wearing Adidas skateboard shoes!");
  }
}

class AdidasBasketBallShoe implements Shoe {

  @Override
  public void wear() {
    System.out.println("Wearing Adidas basketball shoes!");
  }
}

abstract class ShoeFactory {
  public abstract Shoe createRunningShoe();

  public abstract Shoe createSkateBoardShoe();

  public abstract Shoe createBasketBallShoe();

}

class AdidasFactory extends ShoeFactory {
  @Override
  public Shoe createRunningShoe() {
    return new AdidasRunningShoe();
  }

  @Override
  public Shoe createSkateBoardShoe() {
    return new AdidasSkateBoardShoe();
  }

  @Override
  public Shoe createBasketBallShoe() {
    return new AdidasBasketBallShoe();
  }

}

public class App {
  public static void main(String[] args) {

    ShoeFactory adidasFactory = new AdidasFactory();
    Shoe adidasSkateBoardShoe = adidasFactory.createSkateBoardShoe();
    adidasSkateBoardShoe.wear();
    Shoe adidasRunningSHoe = adidasFactory.createRunningShoe();
    adidasRunningSHoe.wear();
    Shoe adidasBasketBallShoe = adidasFactory.createBasketBallShoe();
    adidasBasketBallShoe.wear();

  }
}
