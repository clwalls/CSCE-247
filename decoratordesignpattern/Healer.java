package decoratordesignpattern;
/** 
 * @author chris walls
 * 
 * This class extends Player and has specific values for intellect, attack, defense, weapon, and armor shown in the constructor.
 * 
 */
public class Healer extends Player{
	// Constructor for Healer (which is a Player).
	public Healer (String name) {
		this.name = name;
		this.intellect = 8;
		this.attack = 2;
		this.defense = 3;
		this.weapon = "Staff";
		this.armor = "Robe";
	}
	public String toString() {
		return "Healer: " + super.toString();
	}

}
