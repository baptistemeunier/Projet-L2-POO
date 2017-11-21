import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Forme {
	protected Point centre;
	protected Color color;
	private Mouvement mouvement = null;
	
	public Forme(Color c) {
		this.color = c;
		this.centre = new Point(0, 0);
	}

	public void setMouvement(Mouvement m) {
		this.mouvement = m;
	}
	
	public boolean move() {
		if(this.mouvement == null) {
			return false;
		} else {
			if(this.mouvement.isFinish()) {
				this.mouvement = null;
				return false;
			}
			this.centre = this.mouvement.getNextPoint();
			return true;
		}
	}
	
	public String toString() {
		return this.getClass().getName() + " <" + this.color.toString() + "> : Centre (" + this.centre.getX() + ", " + this.centre.getY() + ")";
	}

	public abstract void draw(Graphics g);

	public Color getColor() {
		return this.color;
	}
}
