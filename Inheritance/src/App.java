import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class App {
    public static void main(String[] args) {
       Shirt shirt = new Shirt(10.66, "blury", "blah", Size.SMALL);
       
       shirt.fold();
       productStore(shirt);

       Pants pants = new Pants(10.66, "pinkish", "nuce",32, 32);
       
       pants.fold();
       productStore(pants);
    }

    public static void productStore(Product product){
        System.out.println("Thank you for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your totatal comes to  " + product.getPrice());
        product.wear();
    }
}
