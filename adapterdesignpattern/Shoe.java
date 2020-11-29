package csce247.adapter;

/**
 * 
 * @author chris
 *
 */

public class Shoe implements ShoeListing {
	
	private String brand;
	private String name;
	private double cost;
	private String description;
	
	public Shoe(String brand, String name, double price, String description) {
		this.brand = brand;
		this.name = name;
		this.cost = price;
		this.description = description;
	}
	
	public String toString() {
		return "Shoe: " + this.name + "By: " + this.brand + "Details: "
				+ this.description + "Cost: $" + this.cost;
	}

}
