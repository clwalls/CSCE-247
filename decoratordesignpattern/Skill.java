/** 
 * @author chris walls
 * 
 * This class extends PlayerDecorator where Players(Warrior, Mage, Healer) can get upgrades
 * like armor, new skills, or weapon upgrades.
 * 
 * Skill tells the toString that the player gained a skill, and adds 2 to power.
 * 
 */
package decoratordesignpattern;

public class Skill extends PlayerDecorator {
	private Player player;
	
	public Skill(Player player) {
		this.player = player;
	}
	public String toString() {
		return player.toString() + "\nGained a skill";
	}
	public double getPower() {
		return player.getPower() + 2;
	}
	
	
}
