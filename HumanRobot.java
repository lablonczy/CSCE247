package Assn01;//lukacs ablonczy

/**
 * Defines the Robot known as Human
 * @author Lukacs Ablonczy
 */
public class HumanRobot extends Robot {

	/**
	 * Constructor to set Name and Behaviors for HumanRobot type
	 * @param name Name to assign to current instance of HumanRobot
	 */
	public HumanRobot(String name) {
		super(name);
		this.setMoveBehavior(new WalkBehavior());
		this.setTalkBehavior(new SpeakBehavior());
	}

	/**
	 * Method to output this HumanRobot to console
	 * @return the name assigned to this HumanRobot followed by "is a typical human robot"
	 */
	public String toString() {
		return this.name + " is a typical human robot";
	}

}
