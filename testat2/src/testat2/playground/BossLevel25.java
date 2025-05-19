package testat2.playground;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

import javashooter.controller.ObjectController;
import javashooter.gameobjects.GameObject;
import spaceinvadersProject.playground.SpaceInvadersLevel;

public class BossLevel25 extends SpaceInvadersLevel {
	public int bossHP = 20;
	
	@Override
	protected int calcNrEnemies() {
		return 1;
	}
	
	@Override
	protected double calcEnemySpeedX() {
	  return 180;
	}
	
	@Override
	protected double calcEnemySpeedY() {
	  return 40;
	}
	
	@Override
	protected double calcEnemyShotProb() {
	  return 0.01 * this.getTimestep();
	}
	
	@Override
	protected String getStartupMessage() {
	   return "BossLevel!!";
	}

	@Override
	protected void actionIfEnemyIsHit(GameObject e, GameObject shot) {
		if (bossHP <= 1) {
			super.actionIfEnemyIsHit(e, shot);
		} else {
			bossHP -= 1;

		    // delete shot
		    deleteObject(shot.getId());
		}
	}
	
	@Override
	public void redrawLevel(Graphics2D g2) {
		super.redrawLevel(g2);
		Font drawFont3 = new Font("SansSerif", Font.PLAIN, 20);
	    AttributedString as3 = new AttributedString("Boss HP: " + bossHP);
	    as3.addAttribute(TextAttribute.FONT, drawFont3);
	    as3.addAttribute(TextAttribute.FOREGROUND, Color.yellow);
	    g2.drawString(as3.getIterator(), 120, 20);
	}
	
	@Override
	protected GameObject createEnemyShotObject(GameObject parentObject, String name,
		      ObjectController limitedTimeController) {
		GameObject to = super.createEnemyShotObject(parentObject, name, limitedTimeController);
		
		GameObject ego = this.getObject("ego");
		
		// Math-Start
		double S = 400.0; // Schussgeschwindigkeit
		
		double d_x = ego.getX() - to.getX();
		double d_y = ego.getY() - to.getY();
		double n = Math.sqrt(d_x * d_x + d_y + d_y);
		
		double v_x = (d_x * S)/n;
		double v_y = (d_y * S)/n;
		// Math-End
		
		to.setVX(v_x);
		to.setVY(v_y);
		
		return to;
		
	}
	      
	
}
