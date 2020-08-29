package strategydesignpattern;

/** 
 * Defenceman is a player who pass/slapshot for offense, chase/block for defense. 
 */
import java.util.Random;

public class Defenceman extends Player {
	Random rand = new Random();
	Defenceman(String name) {
		super(name);
		setOffenceBehavior();
		setDefenceBehavior();
	}

	@Override
	/**
	 * setOffenceBehavior() has a 90% to pass, and 10% to slapshot for defense men.
	 */
	public void setOffenceBehavior() {
		var chance = Math.random();
		if (chance < 0.9) {
			PassBehavior pass = new PassBehavior();
			offenceBehavior = pass;
		} else {
			SlapShotBehavior slap = new SlapShotBehavior();
			offenceBehavior = slap;
		}
	}

	@Override
	/**
	 * setDefenceBehavior() randomly chooses between Chase and Block for defense men.
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
		return name + " plays the position: Defenceman";
	}

}
