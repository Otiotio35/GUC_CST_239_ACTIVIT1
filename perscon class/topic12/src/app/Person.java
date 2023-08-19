package app;

/**
 * I used some of the code given by my instructor for guide
 * 
 * @version 7/21/2023 ID: 21024608
 * @author toafik otiotio
 */
public class Person {
	// Parameters
	private String name;
	private int age;
	private float weight;
	private String gender;
	private String occupation;
	private double height;

	 /**
     * Constructs a new Person object with the specified attributes.
     *
     * @param name       The name of the person.
     * @param age        The age of the person.
     * @param weight     The weight of the person.
     * @param gender     The gender of the person.
     * @param occupation The occupation of the person.
     * @param height     The height of the person.
     */
	 public Person(String name, int age, float weight, String gender, String occupation, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.occupation = occupation;
		this.height = height;
	}

	// Getters and Setters (Optional, but recommended for data encapsulation)

	/**
	 * Gets the name of the person.
	 *
	 * @return The name of the person.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the person.
	 *
	 * @param name The name to set for the person.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age of the person.
	 *
	 * @return The age of the person.
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age of the person.
	 *
	 * @param age The age to set for the person.
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the weight of the person.
	 *
	 * @return The weight of the person.
	 */
	public float getWeight() {
		return weight;
	}

	/**
	 * Sets the weight of the person.
	 *
	 * @param weight The weight to set for the person.
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * Gets the gender of the person.
	 *
	 * @return The gender of the person.
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender of the person.
	 *
	 * @param gender The gender to set for the person.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Gets the occupation of the person.
	 *
	 * @return The occupation of the person.
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * Sets the occupation of the person.
	 *
	 * @param occupation The occupation to set for the person.
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * Gets the height of the person.
	 *
	 * @return The height of the person.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Sets the height of the person.
	 *
	 * @param height The height to set for the person.
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * This method prints a message indicating that the person is walking.
	 */
	public void walk() {
		System.out.println("I am walking.");
	}

	/**
	 * This method prints a message indicating that the person is running.
	 *
	 * @param distance The distance the person is running.
	 * @return The distance covered by the person while running.
	 */
	public float run(float distance) {
		System.out.println("I am running.");
		return 0;
	}

	/**
	 * Main method to demonstrate the usage of the Person class.
	 * 
	 * @param args Command-line arguments (not used in this program).
	 */
	public static void main(String[] args) {
		// Creating a Person object with age 25, name "Bob", weight 165.02, and other
		// attributes not specified in the constructor
		Person person = new Person("Bob", 25, 165.02f, "Male", "Software Engineer", 175.0);

		// Printing the name of the person using the getName() method
		System.out.println("My name is " + person.getName());
		System.out.println("I am " + person.getAge() + " years old.");
		System.out.println("I am a " + person.getGender() + " working as a " + person.getOccupation() + ".");
		System.out
				.println("My height is " + person.getHeight() + " cm and my weight is " + person.getWeight() + " kg.");

		// the person walking using the walk() method
		person.walk();

		//  the person running a distance of 10 units using the run() method
		person.run(10);

	}
}
