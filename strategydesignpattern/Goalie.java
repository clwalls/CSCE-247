package strategydesignpattern;

/**
 * 
 * @author chris
 * Goalie is a player which always blocks.
 *
 */
public class Goalie extends Player {
	/** 
	 * All players have this constructor.
	 * @param name is sent to Player, and methods are called to determine the play based on their role.
	 */
	Goalie(String name) {
		super(name);
		setOffenceBehavior();
		setDefenceBehavior();
	}
	@Override
	/** 
	 * setOffenceBehavior() for Goalie is to block. We make an instance of the class and set the offense behavior appropriately. 
	 */
	public void setOffenceBehavior() {
		BlockGoalBehavior block = new BlockGoalBehavior();
		offenceBehavior = block;
	}
	/** 
	 * setOffenceBehavior() for Goalie is to block. We make an instance of the class and set the defense behavior appropriately. 
	 */
	@Override
	public void setDefenceBehavior() {
		BlockGoalBehavior block = new BlockGoalBehavior();
		defenceBehavior = block;
	}
	/** 
	 * toString() prints the position for each class
	 */
	public String toString() {
		return name + " plays the position: Goalie";
	}
}
