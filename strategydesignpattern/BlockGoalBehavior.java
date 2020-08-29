package strategydesignpattern;

/**
 * BlockGoalBehavior is an offensive and defensive move
 */

import java.util.Random;

public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior {

	Random rand = new Random();
	@Override
	/**
	 * play() has a random choice of 4 options to block.
	 */
	public String play() {
		String output = "";
		// random number [0-3]
		int choice = rand.nextInt(4);
		switch (choice) 
		{
		case 0:
			output = "hand blocks the puck";
			break;
		case 1:
			output = "catches the puck";
			break;
		case 2:
			output = "blocks puck with knee pads";
			break;
		case 3:
			output = "blocks puck with stick";
			break;
		default:
			output = "Error in generating random int";
			break;
		}
		return output;
	}
}
