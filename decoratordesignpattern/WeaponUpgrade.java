/** 
 * @author chris walls
 * 
 * This class extends PlayerDecorator where Players(Warrior, Mage, Healer) can get upgrades
 * like armor, new skills, or weapon upgrades.
 * 
 * Weapon Upgrade tells the toString that the weapon is upgraded, and adds 5 to power.
 * 
 */
package decoratordesignpattern;

public class WeaponUpgrade extends PlayerDecorator {
	private Player player;
	
	public WeaponUpgrade(Player player) {
		this.player = player;
	}
	public String toString() {
		return player.toString() + "\nUpgraded weapon";
	}
	public double getPower() {
		return player.getPower() + 5;
	}

}
