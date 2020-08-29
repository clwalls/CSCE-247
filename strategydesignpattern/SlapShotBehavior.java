package strategydesignpattern;
/**
 * 
 * @author chris
 * SlapShot is an offensive move.
 */

public class SlapShotBehavior implements OffenceBehavior{
	
	public String play() {
		return "shoots the puck from the blue line";
	}

}
