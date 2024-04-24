import model.Car;
import static model.Car.TrafficLight.*;

public class App {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(RED);
    }

}
