package csce247.state;

public class NintendoState implements State {
	
	String[] games = {"The Legends of Zelda", "Super Smash Bros", "Super Mario", "Mario Kart", "Animal Crossing", "Pokemon"};

	@Override
	public void pressHomeButton() {
		System.out.println("Display Home Screen.");
	}

	@Override
	public void pressNintendoButton() {
		System.out.println("You are already viewing Nintendo.");
	}

	@Override
	public void pressXBoxButton() {
		System.out.println("Starting xBox....");
	}

	@Override
	public void pressGameButton() {
		System.out.println("You have the following games:");
		for(String game : games) {
			System.out.println(game);
		}
		System.out.println("\n");
	}

}
