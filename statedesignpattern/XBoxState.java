package csce247.state;

public class XBoxState implements State {
	
	String[] games = {"Forza Horizon", "Ori and the Blind Forest", "Red Dead Redemption", "Fortnite", "Gears", "Cuphead"};

	@Override
	public void pressHomeButton() {
		System.out.println("Display Home Screen.");
	}

	@Override
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo....");
	}

	@Override
	public void pressXBoxButton() {
		System.out.println("You are already viewing XBox");
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
