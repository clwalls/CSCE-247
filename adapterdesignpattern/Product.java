package csce247.adapter;
/** 
 * 
 * @author chris walls
 *
 */

public class Product implements ProductListing {

	private String title;
	private double price;
	private String description;
	
	public Product(String title, double price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
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
		return this.description;
	}

}
