package testat2;


import javashooter.gameutils.GameLoop;
import javashooter.playground.Playground;
import testat2.playground.BossLevel25;

public class Testat2 extends GameLoop {

	@Override
	public Playground nextLevel(Playground currentLevel) {
		// System.out.println("cL " + currentLevel.getName());
		
		if (!(currentLevel instanceof Playground)) {
			currentLevel = new BossLevel25();
		} else if (currentLevel instanceof Playground) {
			currentLevel = null;
		}
		
		return currentLevel;
	}
	
	public static void main(String[] args) {
		Testat2 game = new Testat2();
		game.runGame(args);
		
		// Aufgabe 5:
		// Welche Methode aus SpaceInvadersLevel sollten Sie
		// ueuberschreiben, um ihr dieses neue Verhalten unterzuschieben?
		// 
		// actionIfEnemyIsHit um den Gegner erst zu entfernen wenn alle seine 
		// Hitpoints augebraucht sind
		
		
	}

}
