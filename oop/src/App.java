public class App {
    public static void main(String[] args) {
        String[] spareParts = new String[] { "Tires", "Keys" };
        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
        Car dodge = new Car("Dodge", 11000, 2021, "Greenish", spareParts);
        spareParts[0] = "Filter";
        Car nissan2 = new Car(nissan);

        System.out.println(dodge);
        System.out.println(nissan);
        System.out.println(nissan2);
    }
}
