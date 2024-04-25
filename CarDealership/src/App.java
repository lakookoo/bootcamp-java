import model.Car;
import model.CarDealership;
import model.Car.BodyType;
import static model.Car.MAX_PRICE;
import static model.Car.MIN_PRICE;
import static model.Car.MIN_YEAR;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    
        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);
    
    
        Car newCar = new Car(make, model, bodyType, year, price);
    
    
        CarDealership dealership = new CarDealership();
        dealership.addCar(newCar);
    
    
        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());
    }
    

    public static boolean isNullOrBlank(String input) {
        if (input == null || input.isBlank()){
            return true;
        }
        return false;
    }

    public static boolean invalidYear(int year) {
        if( year < MIN_YEAR ) return true;
        else return false;
    }
    
    public static boolean invalidPrice(double price) {
        if(price < MIN_PRICE || price > MAX_PRICE) return true;
        else return false;
    }
    
    public static boolean invalidBodyType(String bodyType) {
        try {
            BodyType.valueOf(bodyType.toUpperCase());
            return false;
        } catch (IllegalArgumentException e){
            return true;
        }
    }
    
    public static BodyType promptForBodyType(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car body type: ");
            String bodyType = scanner.nextLine();
            if(!invalidBodyType(bodyType)){
                return BodyType.valueOf(bodyType.toUpperCase());
            }
        }
    }
    
    public static String promptForMake(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();
            if(!(isNullOrBlank(make))){
                return make;
            }
        }
    }
    
    public static String promptForModel(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            if(!(isNullOrBlank(model))){
                return model;
            }
        }
    }

    public static int promptForYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid production year: ");
            int year = scanner.nextInt();
            if(!invalidYear(year)){
                return year;
            }
        }
    }
    
    public static double promptForPrice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car price: ");
            double price = scanner.nextDouble();
            if(!(invalidPrice(price))){
                return price;
            }
        }
    }
    
    
}
