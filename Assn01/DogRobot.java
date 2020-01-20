package Assn01;//lukacs ablonczy

/**
 * Defines the Robot known as Dog
 * @author Lukacs Ablonczy
 */
public class DogRobot extends Robot{

	/**
	 * Constructor to set Name and Behaviors for DogRobot type
	 * @param name Name to assign to current instance of DogRobot
	 */
	public DogRobot(String name) {
		super(name);
		this.setMoveBehavior(new CrawlBehavior());
		this.setTalkBehavior(new BarkBehavior());
	}

	/**
	 * Method to output this DogRobot to console
	 * @return the name assigned to this DogRobot followed by "is a happy dog robot"
	 */
	public String toString() {
		return this.name + " is a happy dog robot";
	}

}
