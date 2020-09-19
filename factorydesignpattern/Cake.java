package factorydesignpattern;

/**
 * @author CLWALLS Christopher Walls
 * This abstract class is the layout for all types of cake: birthday cake,
 * black forest cake, and carrot cake that hold all attributes of Cake.
 */
import java.util.*;

public abstract class Cake {
	/**
	 * All the attributes of cake. Each cake will have a name, price
	 * numLayers, decorations, shape, flavor, and icing.
	 */
	protected String name;
	protected double price;
	protected int numLayers;
	protected ArrayList<String> decorations;
	protected Shape shape;
	protected String flavor;
	protected String icing;

	/** Cake's default constructor initializes the ArrayList for
	 * decorations.
	 */
	public Cake() {
		decorations = new ArrayList<String>();
	}
	/** 
	 * createCake calls all of Cake's private methods createLayers,
	 * frostCake, and addDecorations.
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}
	/** createLayers displays the number of layers, shape, and
	 * flavor of cake.
	 */
	private void createLayers() {
		System.out.println("Creating a " + numLayers + " layered " + shape.toString().toLowerCase() + " " + flavor + " cake");
	}
	/** frostCake displays the type of icing. */
	private void frostCake() {
		System.out.println("Frost cake with " + icing + " icing.");
	}
	/** addDecorations iterates throughout the decorations arrayList
	 * to print all the decorations one by one.
	 */
	private void addDecorations() {
		for(String s : decorations) {
			System.out.println("Adding " + s + ".");
		}
	}
	/** getPrice() returns price of cake.
	 */
	public double getPrice() {
		return price;
	}
}
