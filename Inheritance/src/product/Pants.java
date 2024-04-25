package product;
public class Pants extends Product{

    private int waist;
    private int length;

    public Pants(double price, String color, String brand, int waist, int length){
        super(price, color, brand);
        setWaist(waist);
        setLength(length);
    }
   

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void fold() {
        super.fold();
        System.out.println("Hold pant upright");
        System.out.println("Fold one leg over the other");
        System.out.println("Fold pants from bottom in third");
    }

    @Override
    public void wear() {
        System.out.println("The " + waist + " " + length + "looks great on you.");
    }

}