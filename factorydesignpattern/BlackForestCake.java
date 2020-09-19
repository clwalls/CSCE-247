package factorydesignpattern;

public class BlackForestCake extends Cake{
	
	/**
	 * @author CLWALLS
	 * BlackForestCake() is a type of Cake and has unique characteristics
	 * for each attribute.
	 */
	
	public BlackForestCake() {
		this.name = "Black Forest Cake";
		this.price = 47.99;
		this.numLayers = 3;
		this.shape = Shape.ROUND;
		this.flavor = "Black Forest";
		this.icing = "Whipped Cream";
		this.decorations.add("Cherries");
		this.decorations.add("Chocolate Flakes");
		this.decorations.add("Whipped Cream");
	}
}
