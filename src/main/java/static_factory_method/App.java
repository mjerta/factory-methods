package static_factory_method;

public class App {
  public static void  main(String[] args) {

    Shoe redshoe = Shoe.createBigRedShoe(Size.EU_50);
    // To String call is not necessary in println
    System.out.println(redshoe);
  }
}
