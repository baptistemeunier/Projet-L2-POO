import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Forme {

	private int longueur;
	private int hauteur;

	public Rectangle(Color c, int l, int h) {
		super(c);
		this.longueur = l;
		this.hauteur = h;
	}

	@Override
	public void draw(Graphics g) {
		g.fillRect((int) this.centre.getX(),(int) this.centre.getY(), this.longueur, this.hauteur);
	}

}
