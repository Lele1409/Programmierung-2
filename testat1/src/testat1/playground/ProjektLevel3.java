package testat1.playground;

import spaceinvadersProject.playground.SpaceInvadersLevel;

public class ProjektLevel3 extends SpaceInvadersLevel {
	
	@Override
	public String getName() {
		return "Level3";
	}
	
	@Override
	protected int calcNrEnemies() {
		return 10;
	}
	
	@Override
	protected String getStartupMessage() {
		return "Level3";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
