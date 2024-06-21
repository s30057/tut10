import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("MODEL1", 2020));
        cars.add(new Car("MODEL2", 2010));
        cars.add(new Car("MODEL3", 2012));
        cars.add(new Car("MODEL4", 2024));
        cars.add(new Car("MODEL5", 2000));
        cars.add(new Car("MODEL6", 2010));
        cars.add(new Car("MODEL7", 2013));
        cars.add(new Car("MODEL8", 2015));
        cars.add(new Car("MODEL9", 2016));
        cars.add(new Car("MODEL10", 2020));

        Collections.sort(cars);

        for (Car car : cars) {

            System.out.println(car);

        }

    }
}