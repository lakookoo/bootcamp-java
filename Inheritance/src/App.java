import product.Pants;
import product.Shirt;
import product.Shirt.Size;

public class App {
    public static void main(String[] args) {
       Shirt shirt = new Shirt();
       shirt.setSize(Size.SMALL);
       shirt.setBrand("nike");
       shirt.setColor("blue");
       shirt.setPrice(14.99);
       shirt.fold();

       Pants pants = new Pants();
       pants.setWaist(32);
       pants.setLength(32);
       pants.setBrand("nuce");
       pants.setColor("black");
       pants.setPrice(32.34);
       pants.fold();
    }
}
