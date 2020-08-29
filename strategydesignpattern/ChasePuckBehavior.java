package strategydesignpattern;
/** 
 * 
 * @author chris
 * ChasePuckBehavior is a type of defence behavior.
 */

public class ChasePuckBehavior implements DefenceBehavior {
	
	public String play() {
		return "chases the puck";
	}

}
