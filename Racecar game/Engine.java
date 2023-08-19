package car;

/** I some code from this site https://onecompiler.com/java/3x2k39nt6
 * The Engine class represents an engine of a vehicle.
 * It provides methods to start and stop the engine, and check if the engine is running.
 */
public class Engine {
    private boolean running;

    /**
     * Creates a new Engine object with the running status set to false.
     */
    public Engine() {
        running = false;
    }

    /**
     * Checks if the engine is currently running.
     *
     * @return true if the engine is running, false otherwise.
     */
    public boolean isRunning() {
        return running;
    }

    /**
     * Starts the engine.
     * If the engine is already running, this method does nothing.
     * When the engine is started, a message is printed
     */
    public void start() {
        running = true;
        System.out.println("Engine started.");
    }

    /**
     * Stops the engine.
     * If the engine is not running, this method does nothing.
     * When the engine is stopped, a message is printed.
     */
    public void stop() {
        if (running) {
            running = false;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Engine is not running.");
        }
    }
}
