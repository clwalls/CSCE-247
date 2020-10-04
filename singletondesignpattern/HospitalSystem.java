package singletondesignpattern;
import java.util.*;

/**
 * 
 * @author chris
 * HospitalSystem is a class that stores and manages patients and their records.
 */
public class HospitalSystem {
	
	private ArrayList<Patient> patients;
	private HospitalSystem hospitalSystem;
	
	/**
	 * Default constructor initializes the patient arrayList.
	 */
	private HospitalSystem() {
		patients = new ArrayList<Patient>();
	}
	
	/**
	 * 
	 * @return 
	 * creates a new instance of the HospitalSystem, initializing the system.
	 */
	public static HospitalSystem getInstance() {
		return new HospitalSystem();
	}
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @return adds a patient using their first and last name, and using their position in the patients
	 * ArrayList/Hospital System as the id.
	 */
	public int addPatient(String firstName, String lastName) {
		int id = patients.size();
		Patient newPatient = new Patient(id, firstName, lastName);
		patients.add(newPatient);
		return id;
	}
	/**
	 * 
	 * @param id
	 * @return returns the Patients record, the toString of the patient containing names and allergies.
	 */
	public Patient getRecord(int id) {
		return patients.get(id);
	}
	/**
	 * 
	 * @param id
	 * @param allergy
	 * addAllergy(int id, String allergy) adds an allergy to the patient's allergyList based off their id.
	 */
	public void addAllergy(int id, String allergy) {
		patients.get(id).addAllergy(allergy);
	}
	/**
	 * 
	 * @returns the toString for each patient, and appends it to one String.
	 */
	public String getAllPatientsData() {
		String output = "";
		for(Patient patients : patients) {
			output = output + patients.toString();
		}
		return output;
	}

}
