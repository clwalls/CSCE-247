package observerdesignpattern;
/** 
 * 
 * @author Chris Walls 09/06/20
 * 
 * This Sighting class contains location/details for the ArrayList the cartel uses.
 */

public class Sighting {
	private String location;
	private String details;
	
	public Sighting(String location, String details) {
		this.location = location;
		this.details = details;
		
	}
	
	public String getLocation() {
		return this.location;
	}
	public String getDetails() {
		return this.details;
	}

}
