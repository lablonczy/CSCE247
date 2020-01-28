package Assn02;//lukacs ablonczy

import java.util.ArrayList;

/**
 * Defines baby Subject type
 * @author Lukacs Ablonczy
 */
public class Baby implements Subject {

	private ArrayList<Observer> observers;
	private Cry cry;

	/**
	 * Construct for Baby Subject type
	 * Instantiates observers ArrayList and outputs a message
	 */
	public Baby() {
		observers = new ArrayList<>();
		System.out.println("A baby is born");
	}

	/**
	 * Adds a parent Observer type for this Baby to update
	 * @param observer An Observer type that will be updated by this Subject
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	/**
	 * Removes a parent Observer type for this Baby to no longer update
	 * @param observer An Observer type that will be updated by this Subject
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	/**
	 * Calls update on all Observer types in this observer arraylist
	 */
	public void notifyObservers() {
		for (Observer parent : observers)
			parent.update(this.cry);
	}

	/**
	 * Outputs a value, sets this Baby cry type to angry, and updates observers
	 */
	public void angryCry() {
		System.out.println("This baby is angry!");
		cry = Cry.ANGRY;
		notifyObservers();
		System.out.println();

	}

	/**
	 * Outputs a value, sets this Baby cry type to hungry, and updates observers
	 */
	public void hungryCry() {
		System.out.println("This baby is hungry");
		cry = Cry.HUNGRY;
		notifyObservers();
		System.out.println();
	}

	/**
	 * Outputs a value, sets this Baby cry type to wet, and updates observers
	 */
	public void wetCry() {
		System.out.println("This baby is wet");
		cry = Cry.WET;
		notifyObservers();
		System.out.println();
	}

}
