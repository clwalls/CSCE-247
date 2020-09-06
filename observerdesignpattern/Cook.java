package observerdesignpattern;

import java.util.*;
/** 
 * 
 * @author Chris Walls 09/06/20
 * 
 * This Cook class is a subject which we are observing. In this case 'heisenberg' is a meth cook
 * and we want to notify the observers: the DEA and the Cartel on what he is doing where.
 *
 */
public class Cook implements Subject {
	private String name;
	private ArrayList<Observer> observers;
	
	public Cook(String name) {
		this.name = name;
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	/** 
	 * notifyObservers method tells the observers DEA/Cartel the Cook's location and description.
	 */
	@Override 
	public void notifyObservers(String location, String description) {
		for(Observer observer : observers) {
			observer.update(location, description);
		}
	}
	
	public void enterSighting(String location, String description) {
		notifyObservers(location, description);
	}
	public String getName() {
		return this.name;
	}
	
}
