package csce247.adapter;
/** 
 * 
 * @author chris walls
 *
 * ShoeListingAdapter adapts Shoes to work with ProductListing.
 */

public class ShoeListingAdapter implements ProductListing{
	
	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	
	/**
	 * 
	 * @param shoe
	 * takes in shoe and sets it for this class.
	 * 
	 * Default constructor
	 * 
	 * Uses the shoe.toString() to parse for it works just like a regular Product using ProductListing methods.
	 */
	public ShoeListingAdapter(ShoeListing shoe) {
		this.shoe = shoe;
		this.title = this.shoe.toString().substring(this.shoe.toString().indexOf("Shoe: ")+6, this.shoe.toString().indexOf("By:"));
		this.price = Double.parseDouble(this.shoe.toString().substring(this.shoe.toString().indexOf("$")+1));
		this.brand = this.shoe.toString().substring(this.shoe.toString().indexOf("By: ")+4, this.shoe.toString().indexOf("Details:"));
		this.description = this.shoe.toString().substring(this.shoe.toString().indexOf("Details: ")+9, this.shoe.toString().indexOf("Cost: $"));
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public String getDescription() {
		return "Created by " + this.brand + ", " + this.description;
	}

}
