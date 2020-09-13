/** 
 * @author chris walls
 * 
 * This class is called Player which can be a warrior, mage, or healer. 
 * 
 */
package decoratordesignpattern;

public abstract class Player{
	// The values all types of Players hold
	protected String name;
	protected int intellect;
	protected int defense;
	protected int attack;
	protected String weapon;
	protected String armor;
	
	// toString for all types of players, returns name and displays weapon and armor type.
	public String toString() {
		return this.name + "\nCarries a " + this.weapon + ", and wears a " + this.armor;
	}
	// getPower() for all types of players is calculated the same way, despite their type.
	public double getPower() {
		return this.attack*3 + this.defense + this.intellect/2;
	}

}
