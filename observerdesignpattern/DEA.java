package observerdesignpattern;

import java.util.*;
/** 
 * 
 * @author Chris Walls 09/06/20
 * 
 * This DEA class is an Observer which studies the cook subject. They store his locations
 * in an arraylist, and the details/descriptions in a string notes.
 */

public class DEA implements Observer {

	private Subject cook;
	private ArrayList<String> locations;
	private String notes = "";
	
	public DEA (Subject cook) {
		this.cook = cook;
		this.locations = new ArrayList<String>();
		cook.registerObserver(this);
	}
	
	public void update (String location, String description) {
		locations.add(location);
		this.notes += description + "\n";
	}
	
	public String getLog() {
		String output = "Locations:\n";
		for (String  in : locations) {
			output += in + "\n";
		}
		output += "\nNotes:\n";
		output += notes;
		return output;
	}

}
