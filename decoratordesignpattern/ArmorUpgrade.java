/** 
 * @author chris walls
 * 
 * This class extends PlayerDecorator where Players(Warrior, Mage, Healer) can get upgrades
 * like armor, new skills, or weapon upgrades.
 * 
 * Armor Upgrade tells the toString that armor is upgraded, and adds 3 to power.
 * 
 */
package decoratordesignpattern;

public class ArmorUpgrade extends PlayerDecorator{
	private Player player;
	
	public  ArmorUpgrade(Player player) {
		this.player = player;
	}
	public String toString() {
		return player.toString() + "\nUpgraded armor";
	}
	public double getPower() {
		return player.getPower() + 3;
	}
	

}
