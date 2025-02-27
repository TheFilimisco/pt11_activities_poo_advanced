package part2.transports.test;

import part2.transports.model.Bicycle;
import part2.transports.model.Car;
import part2.transports.model.Subway;

public class TestTransport {
    public static void main(String[] args) {

        // Car
        Car car = new Car((short) 80, Car.TypeOfFuel.GASOLINE, 2,3 );
        System.out.println(car.getHourTimeByDistanceTraveled(100));
        System.out.println(car.getHourTimeByDistanceTraveled(90));
        System.out.println(car.getPriceByDistanceTraveled(200));
        System.out.println(car.getPriceByDistanceTraveled(100));

        // Bicycle
        Bicycle bicycle = new Bicycle((short)20, 3);
        System.out.println(bicycle.getHourTimeByDistanceTraveled(100));
        System.out.println(bicycle.getPriceByDistanceTraveled(100));

        // Subway
        Subway subway = new Subway((short) 120, 2.55);
        System.out.println(subway.getHourTimeByDistanceTraveled(100));
        System.out.println(subway.getPriceByDistanceTraveled(100));



    }
}
