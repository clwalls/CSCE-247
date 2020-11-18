package csce247.state;

public class GameConsole {
	
	private State HomeState;
	private State NintendoState;
	private State xBoxState;
	private State state;
	
	public GameConsole() {
		HomeState = new HomeState();
		NintendoState = new NintendoState();
		xBoxState = new XBoxState();
		setState(HomeState);
		System.out.println("Starting up the Game Console\n");
	}
	
	public void pressHomeButton() {
		state.pressHomeButton();
		setState(HomeState);
	}
	
	public void pressNintendoButton() {
		state.pressNintendoButton();
		setState(NintendoState);
	}
	
	public void pressXBoxButton() {
		state.pressXBoxButton();
		setState(xBoxState);
	}
	
	public void pressGameButton() {
		state.pressGameButton();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getHomeState() {
		return this.HomeState;
	}
	
	public State getNintendoState() {
		return this.NintendoState;
	}
	
	public State getXBoxState() {
		return this.xBoxState;
	}
	

}
