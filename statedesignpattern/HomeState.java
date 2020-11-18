package csce247.state;

public class HomeState implements State {

	@Override
	public void pressHomeButton() {
		System.out.println("You are already on the home screen.");
	}

	@Override
	public void pressNintendoButton() {
		System.out.println("Starting Nintendo....");
	}

	@Override
	public void pressXBoxButton() {
		System.out.println("Starting xBox....");
	}

	@Override
	public void pressGameButton() {
		System.out.println("You have to pick a gaming system to play.");
	}

}
