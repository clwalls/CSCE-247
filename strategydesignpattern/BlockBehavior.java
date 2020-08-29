package strategydesignpattern;

import java.util.Random;
/**
 * 
 * @author chris
 * BlockBehavior is a type of defense behavior.
 */

public class BlockBehavior implements DefenceBehavior {

	Random rand = new Random();
	@Override
	/**
	 * play() has a random choice of 4 options to return when a player has a blockbehavior.
	 */
	public String play() {
		String output = "";
		// random number 0-2
		int choice = rand.nextInt(3);
		switch (choice) 
		{
		case 0:
			output = "blocks player from passing";
			break;
		case 1:
			output = "blocks player from shooting";
			break;
		case 2:
			output = "checks player with puck";
			break;
		default:
			output = "Error in generating random int";
			break;
		}
		return output;
	}

}
