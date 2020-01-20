package Assn01;//lukacs ablonczy

/**
 * Defines the Robot parent class
 * @author Lukacs Ablonczy
 */
public abstract class Robot {

	protected String name;
	protected MoveBehavior moveBehavior;
	protected TalkBehavior talkBehavior;

	/**
	 * Defines name of child Robot instance
	 * @param aName name of child Robot instance
	 */
	public Robot(String aName) {
		this.name = aName;
	}

	/**
	 * Changes the move behavior of this instance of child robot
	 * @param mB the new move behavior to set
	 */
	public void setMoveBehavior(MoveBehavior mB) {
		this.moveBehavior = mB;
	}

	/**
	 * Changes the talk behavior of this instance of child robot
	 * @param tB the new talk behavior to set
	 */
	public void setTalkBehavior(TalkBehavior tB) {
		this.talkBehavior = tB;
	}

	/**
	 * Returns the current move behavior of the inheriting robot
	 * @return the move behavior string of the current child robot
	 */
	public String move() {
		return moveBehavior.move();
	}

	/**
	 * Returns the current talk behavior of the inheriting robot
	 * @return the talk behavior string of the current child robot
	 */
	public String talk() {
		return talkBehavior.talk();
	}

	/**
	 * Abstract String, allows inheriting classes to define their own behavior, as no child classes will have the same behavior
	 * @return NA in this specific class, defined in inheriting classes
	 */
	public abstract String toString();



}
