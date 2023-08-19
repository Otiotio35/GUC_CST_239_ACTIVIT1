package racecars;

import car.Engine;
import car.Tire;

/**
 * The Car class represents a car with an engine and four tires.
 * It provides methods to start and stop the engine, drive the car, and restart the car.
 */
public class Car {
    private Engine engine;
    private Tire[] tires;

    /**
     * Creates a new Car object with a new Engine and an array of tires.
     * The initial engine state is stopped, and the tire array is empty.
     */
    public Car() {
        engine = new Engine();
        tires = new Tire[4];
    }

    /**
     * Sets the tires for the car.
     *
     * @param tires an array of Tire objects representing the car's tires.
     */
    public void setTires(Tire[] tires) {
        this.tires = tires;
    }

    /**
     * Starts the car's engine if all tires have sufficient pressure.
     * If some tires have low pressure, the engine will not start.
     */
    public void startEngine() {
        boolean allTiresOk = true;
        for (Tire tire : tires) {
            if (tire.getPressure() < 32) {
                allTiresOk = false;
                break;
            }
        }

        if (allTiresOk) {
            engine.start();
            System.out.println("Engine started.");
        } else {
            System.out.println("Cannot start the engine.");
        }
    }

    /**
     * Drives the car at a given speed if the engine is running.
     *
     * @param speed the speed at which the car is driven.
     */
    public void driveCar(int speed) {
        if (engine.isRunning()) {
            System.out.println("Driving the car at " + speed + " mph.");
        } else {
            System.out.println("Cannot drive the car.");
        }
    }

    /**
     * Stops the car's engine.
     */
    public void stopEngine() {
        engine.stop();
        System.out.println("Engine stopped.");
    }

    /**
     * Restarts the car by starting the engine if it was running, or stopping and starting
     * the engine if it was not running.
     */
    public void restartCar() {
        if (engine.isRunning()) {
            engine.start();
            System.out.println("Car restarted.");
        } else {
            engine.stop();
            System.out.println("Engine stopped.");
            engine.start();
            System.out.println("Car restarted.");
        }
    }
}
