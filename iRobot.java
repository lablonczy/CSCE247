package Assn01;//lukacs ablonczy

/**
 * Defines the Robot known as iRobot
 * @author Lukacs Ablonczy
 */
public class iRobot extends Robot{

	/**
	 * Constructor to set Name and Behaviors for iRobot type
	 * @param name Name to assign to current instance of iRobot
	 */
	public iRobot(String name) {
		super(name);
		this.setMoveBehavior(new RunBehavior());
		this.setTalkBehavior(new SpeakBehavior());
	}

	/**
	 * Method to output this iRobot to console
	 * @return the name assigned to this iRobot followed by "is a scary iRobot!!!"
	 */
	public String toString(){
		return this.name + " is a scary iRobot!!!";
	}

}
