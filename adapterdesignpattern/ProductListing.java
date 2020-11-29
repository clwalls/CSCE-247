package csce247.adapter;
/**
 * 
 * @author chris
 * InterFace for Products: must have getTitle, getPrice(), and getDescription().
 */
public interface ProductListing {

	public String getTitle();
	
	public double getPrice();
	
	public String getDescription();
	
}
