package factorydesignpattern;

public class CarrotCake extends Cake {

	/**
	 * @author CLWALLS
	 * CarrotCake() is a type of Cake and has unique characteristics
	 * for each attribute.
	 */
	public CarrotCake( ) {
		
		this.name = "Carrot Cake";
		this.price = 54.99;
		this.numLayers = 2;
		this.shape = Shape.ROUND;
		this.flavor = "Carrot";
		this.icing = "Cream Cheese";
		this.decorations.add("Walnuts");
		this.decorations.add("Candy Carrots");
	}
}
