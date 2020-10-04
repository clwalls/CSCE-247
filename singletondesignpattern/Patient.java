package singletondesignpattern;
import java.util.*;

/**
 * 
 * @author chris
 * Patient class is for patients in the HospitalSystem.
 * Patients have a unique ID, first and last name, and a list of their allergies.
 */
public class Patient {
	
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies = new ArrayList<String>();
	
	/**
	 * 
	 * @param id
	 * @param firstName
	 * @param lastName
	 * 
	 * Initial constructor for patient.
	 */
	public Patient(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * 
	 * @param allergy
	 * addAllergy() adds a String allergy to a patient's list of allergies.
	 */
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	/**
	 * @return String
	 * returns a toString of patient data including their id, first and last name, and list of allergies if they
	 * have any.
	 */
	public String toString() {
		int realID = id + 1;
		String output = "Patient " + realID + ": " + firstName + " " + lastName + "\n";
		if(allergies.size() != 0) {
			output += "\tAllergies:";
		}
		for(int i = 0; i < allergies.size(); i++) {
			output += " " + allergies.get(i);
			if(i+1 < allergies.size()) {
				output += ", ";
			}
		}
		output = output + "\n\n";
		return output;
	}

}
