package strategydesignpattern;
/**
 * 
 * @author chris
 * PassBehavior is a type of offensive move.
 */

public class PassBehavior implements OffenceBehavior{
	
	public String play() { 
		return "passes to a forward";
	}

}
