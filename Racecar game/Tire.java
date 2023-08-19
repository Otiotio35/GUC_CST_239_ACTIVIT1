package car;

/**
 * I used some code from this site  https://commons.apache.org/proper/commons-net/examples/ntp/SimpleNTPServer.java
 * The Tire class represents a tire of a vehicle.
 * It provides methods to get the tire pressure and to inflate the tire.
 */
public class Tire {
    private double pressure;

    /**
     * Creates a new Tire object with the specified initial pressure.
     *
     * @param pressure the initial pressure of the tire.
     */
    public Tire(double pressure) {
        this.pressure = pressure;
    }

    /**
     * Gets the current pressure of the tire.
     *
     * @return the current pressure of the tire.
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * Inflates the tire by a specified amount.
     *
     * @param amount the amount by which to inflate the tire.
     */
    public void inflateTire(double amount) {
        pressure += amount;
    }
}
