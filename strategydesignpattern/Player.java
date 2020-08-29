package strategydesignpattern;

/**
 * 
 * @author Christopher Walls
 * This class Player is an abstract which Goalie, Forward, and Defenceman extend. 
 * It is designed to store player's names, if it is their time on offense or defense,
 * and their behaviors according to their role.
 */
public abstract class Player implements DefenceBehavior, OffenceBehavior{
	
	protected String name;
	private Boolean offence;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	
	/**
	 * @param inputName is the player name that is passed from the main driver
	 * we start on offense side so offense is set to true in the constructor.
	 */
	Player(String inputName) {
		name = inputName;
		offence = true;
	}
	
	public abstract void setDefenceBehavior();
	public abstract void setOffenceBehavior();
	
	/**
	 * This play method determines which part of the game it is on, offense or defense.
	 */
	public String play() {
		if (offence == true) {
			return offenceBehavior.play();
		} else {
			return defenceBehavior.play();
		}
	}
	
	/** 
	 * Turnover() method is used to switch sides.
	 */
	public void turnover() {
		offence = !offence;
	}

}
