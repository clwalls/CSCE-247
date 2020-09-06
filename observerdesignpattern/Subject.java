package observerdesignpattern;
/** 
 * 
 * @author chris
 * An interface for the Subject: Cook
 */

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(String location, String description);
	
}
