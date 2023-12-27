
import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.add("44");
            cars.add("66");

            cars.set(1, "car1");

            cars.remove(0);

            System.out.println(cars);
            System.out.println(cars.isEmpty());

            System.out.println(cars.contains("44"));
            cars.remove(2);
            System.out.println(cars.get(2));
            System.out.println(cars);
            System.out.println(cars.indexOf("66"));
            System.out.println(cars.lastIndexOf("44"));
            cars.clear();
            System.out.println(cars);

        }
    }
