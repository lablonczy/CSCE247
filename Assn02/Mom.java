package Assn02;//lukacs ablonczy

/**
 * Defines Mom Observer type
 * @author Lukacs Ablonczy
 */
public class Mom implements Observer {

	private Subject baby;

	/**
	 * Construct for Mom Observer type. Assigns a baby to this mom, and makes the baby begin updating this mom
	 * @param baby
	 */
	public Mom(Subject baby) {
		this.baby = baby;
		baby.registerObserver(this);
	}

	/**
	 * Outputs a value depending on baby Subject's current cry status
	 * @param cry Given by subject, used to determine subject's current cry status
	 */
	public void update(Cry cry) {
		switch (cry) {
			case ANGRY:
				System.out.println("Mom hugs and rocks baby, maybe spoiling");
				break;
			case HUNGRY:
				System.out.println("Mom cuddles and feeds baby");
				break;
			case WET:
				System.out.println("Mom changes baby");
				break;
		}
	}

}
