package driverScript;

import racecars.Car;
import car.Tire;

/**
 *  It shows starting and stopping the car's engine, and driving the car at a certain speed.
 *
 *
 * @version 7/21/2023 ID: 21024608
 * @author toafik otiotio
 */
public class Driver {
    public static void main(String[] args) {
        // Create an array of tires for the car
        Tire[] tires = { new Tire(35), new Tire(34), new Tire(33), new Tire(35) };

        // Create a new car and set its tires
        Car car = new Car();
        car.setTires(tires);

        // Stop the engine (assuming it was already started)
        car.stopEngine();

        // Drive the car at a speed of 60 mph
        car.driveCar(60);

        // Stop the engine again
        car.stopEngine();

        // Restart the car
        car.restartCar();
    }
}
