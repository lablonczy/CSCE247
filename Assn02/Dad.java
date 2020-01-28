package Assn02;//lukacs ablonczy

/**
 * Defines Dad Observer type
 * @author Lukacs Ablonczy
 */
public class Dad implements Observer {

	private Subject baby;

	/**
	 * Construct for Dad Observer type. Assigns a baby to this mom, and makes the baby begin updating this dad
	 * @param baby
	 */
	public Dad(Subject baby) {
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
				System.out.println("Dad puts in earplugs");
				break;
			case HUNGRY:
				System.out.println("Dad feeds baby");
				break;
			case WET:
				System.out.println("Dad calls mom");
				break;
		}
	}
}
