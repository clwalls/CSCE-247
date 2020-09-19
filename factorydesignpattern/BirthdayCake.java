package factorydesignpattern;

public class BirthdayCake extends Cake{

	/**
	 * @author CLWALLS
	 * BirthdayCake() is a type of Cake and has unique characteristics
	 * for each attribute.
	 */
	
	public BirthdayCake() {
		this.name = "Birthday Cake";
		this.price = 109.99;
		this.numLayers = 1;
		this.shape = Shape.SHEET;
		this.flavor = "Funfetti";
		this.icing = "Vanilla";
		this.decorations.add("Sprinkles");
		this.decorations.add("Candy Flowers");
		this.decorations.add("Icing Writing");
	}
}
