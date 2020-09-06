package observerdesignpattern;
/** 
 * 
 * @author chris walls
 * An interface for the observers: DEA and Cartel.
 */

public interface Observer {
	public void update (String location, String description);
	public String getLog();

}
