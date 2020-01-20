package Assn01;//lukacs ablonczy

/**
 * Defines the Robot known as WallE
 * @author Lukacs Ablonczy
 */
public class WallERobot extends Robot{

	/**
	 * Constructor to set Name and Behaviors for WallERobot type
	 * @param name Name to assign to current instance of WallERobot
	 */
	public WallERobot(String name) {
		super(name);
		this.setMoveBehavior(new WalkBehavior());
		this.setTalkBehavior(new SimpleSpeakBehavior());
	}

	/**
	 * Method to output this WallERobot to console
	 * @return the name assigned to this WallERobot followed by "is an environmentally friendly Wall-E Robot"
	 */
	public String toString(){
		return this.name + " is an environmentally friendly Wall-E Robot";
	}

}
