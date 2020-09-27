package iteratordesignpattern;

import java.util.*;
/**
 * 
 * @author chris
 *
 */
public class ToDo {

	private String title;
	private String description;
	private double price;
	private String contact;
	private ArrayList<String> supplies;
	
	/**
	 * 
	 * @param title
	 * @param description
	 * @param price
	 * @param contact
	 * @param supplies
	 * All params used in constructing a new ToDo[]
	 */
	public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.contact = contact;
		this.supplies = supplies;
	}
	/**
	 * 
	 * @return the ToDo price
	 */
	public double getPrice() {
		return this.price;
	}

	/**
	 * returns a pretty string format to match output.txt
	 */
	public String toString() {
		String tempReturn = "\n***** " + title + " *****\n" + description + "\nBusiness Contact: " + contact + "\nSupply List: ";
		for(String s : supplies) {
			tempReturn += "\n- " + s;
		}
		tempReturn += "\nPrice: $" + getPrice();;
		return tempReturn;
	}
}
