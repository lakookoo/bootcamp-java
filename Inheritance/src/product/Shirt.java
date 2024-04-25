package product;

public class Shirt extends Product{
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    public Shirt(double price, String color, String brand, Size size){
        super(price, color, brand);
        setSize(size);
    }

    
    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Lay shirt on a flat surface.");
        System.out.println("Fold the shirt sideways");
        System.out.println("Bring sleeves in");
        System.out.println("fold from bottom up");
    }

    @Override
    public void wear() {
        System.out.println("The " + this.size + "looks great on you!");
    }

    @Override
    public String toString() {
        return "SHIRT" + this.size + " " + this.getBrand() + " " + super.getBrand() + " " + super.getColor() + " " + super.getPrice();
    }


}