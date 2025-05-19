package games;

import javashooter.playground.Playground;
import spaceinvadersProject.playground.Level1;

public class MyGame extends javashooter.gameutils.GameLoop {

	public static void main(String[] args) {
		MyGame inst = new MyGame();
		inst.runGame(args);

	}

	@Override
	public Playground nextLevel(Playground currentLevel) {
		if (currentLevel == null) {
			return new Level1();
		}
		return null;
	}

}
