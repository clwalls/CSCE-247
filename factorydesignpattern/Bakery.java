/**
 * @author CLWALLS Christopher Walls
 */
package factorydesignpattern;

public class Bakery {
	
	/**
	 * private CreateCake() returns the type of cake
	 * based on incoming param type.
	 * @param type
	 * @return cake
	 */
	private Cake createCake(String type) {
		Cake cake = null;
		if (type.equalsIgnoreCase("carrot cake")) 
				cake = new CarrotCake();
		if (type.equalsIgnoreCase("black forest cake")) 
			cake = new BlackForestCake();
		if (type.equalsIgnoreCase("birthday cake")) 
			cake = new BirthdayCake();
		return cake;
	}
	/**
	 * orderCake this method calls the private createCake method
	 * and calls the cake's createCake method, and displays the price
	 * of the cake.
	 * @param type
	 * @return
	 */
	public Cake orderCake(String type) {
		Cake cake = this.createCake(type);
		cake.createCake();
		System.out.println("Price: $" + cake.getPrice());
		return cake;
	}

}
