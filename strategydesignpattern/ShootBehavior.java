package strategydesignpattern;
/** 
 * 
 * @author chris
 * ShootBehavior is an offensive move.
 */

public class ShootBehavior implements OffenceBehavior{
	
	public String play() {
		return "shoots at the goal";
	}

}
