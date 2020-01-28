package Assn02;

/**
 * This in an interface that spells out any Observer type
 * @author Lukacs Ablonczy
 */
public interface Observer {

	/**
	 * For implementing classes to display their new output after update is called by a Subject
	 * @param cry Given by subject, used to determine subject's current cry status
	 */
	public void update(Cry cry);

}
