/** 
 * @author chris walls
 * 
 * This class extends Player and has specific values for intellect, attack, defense, weapon, and armor shown in the constructor.
 * 
 */
package decoratordesignpattern;

public class Warrior extends Player{
	// Constructor for Warrior (which is a Player).
	public Warrior(String name) {
		this.name = name;
		this.intellect = 2;
		this.attack = 8;
		this.defense = 5;
		this.weapon = "Sword";
		this.armor = "Breast Plate";
	}
	
	public String toString() {
		return "Warrior: " + super.toString();
	}

}
