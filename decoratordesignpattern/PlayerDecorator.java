/** 
 * @author chris walls
 * 
 * This class is for upgrades to the Players, where it can be an armor/weapon upgrade, or gaining a new skill.
 */
package decoratordesignpattern;

public abstract class PlayerDecorator extends Player {
	public abstract String toString();
	public abstract double getPower();

}
