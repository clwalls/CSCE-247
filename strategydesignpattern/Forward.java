package strategydesignpattern;

/**
 * Forward is a player who has choices between pass/shoot for offense, and chase/block for defense. 
 */
import java.util.Random;

public class Forward extends Player {
	Random rand = new Random();
	Forward(String name) {
		super(name);
		setOffenceBehavior();
		setDefenceBehavior();
	}

	@Override
	/**
	 * setOffenceBehavior() randomly chooses between Pass and Shoot for Forwards.
	 */
	public void setOffenceBehavior() {
		int choice = rand.nextInt(2);
		switch (choice) 
		{
		case 0:
			PassBehavior pass = new PassBehavior();
			offenceBehavior = pass;
			break;
		case 1:
			ShootBehavior shoot = new ShootBehavior();
			offenceBehavior = shoot;
			break;
		}
	}
	@Override
	/**
	 * setDefenceBehavior() randomly chooses between Chase and Block for Forwards.
	 */
	public void setDefenceBehavior() {
		int choice = rand.nextInt(2);
		switch (choice) 
		{
		case 0:
			ChasePuckBehavior chase = new ChasePuckBehavior();
			defenceBehavior = chase;
			break;
		case 1:
			BlockBehavior block = new BlockBehavior();
			defenceBehavior = block;
			break;
		}
	}
	/**
	 * toString() prints the player's name and position.
	 */
	public String toString() {
		return name + " plays the position: Forward";
	}
	

}
