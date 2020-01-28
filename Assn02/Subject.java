package Assn02;

/**
 * This in an interface that spells out any Subject type
 * @author Lukacs Ablonczy
 */
public interface Subject {

	/**
	 * For implementing classes to add observers which they will update
	 * @param observer An Observer type that will be updated by this Subject
	 */
	public void registerObserver(Observer observer);

	/**
	 * For implementing classes to stop updating an Observer
	 * @param observer An Observer type that will no longer be updated by this Subject
	 */
	public void removeObserver(Observer observer);

	/**
	 * For implementing classes to update their observers
	 */
	public void notifyObservers();

}
