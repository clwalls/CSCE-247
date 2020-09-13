/** 
 * @author chris walls
 * 
 * This class extends Player and has specific values for intellect, attack, defense, weapon, and armor shown in the constructor.
 * 
 */
package decoratordesignpattern;

public class Mage extends Player{
	// Constructor for Mage (which is a Player).
	public Mage(String name) {
		this.name = name;
		this.intellect = 7;
		this.attack = 3;
		this.defense = 4;
		this.weapon = "Staff";
		this.armor = "Robe";
	}
	public String toString() {
		return "Mage: " + super.toString();
	}
	

}
