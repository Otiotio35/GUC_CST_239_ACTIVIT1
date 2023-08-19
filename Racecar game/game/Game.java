package game;

import racecars.Car;
import car.Tire;

/**
 * The Game class represents a simple game app involving a car. * @version
 * 
 * @version 7/21/2023 ID: 21024608
 * @author toafik otiotio
 */
public class Game {
	public static void main(String[] args) {
		// Create an array of tires for the car
		Tire[] tires = { new Tire(35), new Tire(34), new Tire(33), new Tire(35) };

		// Create a new car and set its tires
		Car car = new Car();
		car.setTires(tires);

		// Start the engine
		car.startEngine();

		// Drive the car at a speed of 40 mph
		car.driveCar(40);

		// Stop the engine
		car.stopEngine();

		// Restart the car
		car.restartCar();
	}
}
