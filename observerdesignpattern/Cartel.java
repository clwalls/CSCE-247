package observerdesignpattern;

import java.util.*;
/** 
 * 
 * @author Chris Walls 09/06/20
 * 
 * This Cartel class is an Observer which studies the cook subject. They store his locations
 * in an and his details/description in an ArrayList of sightings.
 */

public class Cartel implements Observer {

	private Subject cook;
	private ArrayList<Sighting> sightings;
	
	public Cartel (Subject cook) {
		this.cook = cook;
		this.sightings = new ArrayList<Sighting>();
		cook.registerObserver(this);
	}
	
	public void update (String location, String description) {
		sightings.add(new Sighting(location, description));
	}
	public String getLog() {
		String output = "";
		for (Sighting  in : sightings) {
			output += in.getLocation() + "(" + in.getDetails() + ")\n";
		}
		return output;
	}

}
