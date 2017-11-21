import java.awt.Color;
import java.awt.Graphics;

/**
 * Class qui permet de representé un cercle
 * @author baptiste
 *
 */
public class Cercle extends Forme {

	private int rayon;

	public Cercle(Color c, int r) {
		super(c);
		this.rayon = r;
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval((int) this.centre.getX(),(int) this.centre.getY(), this.rayon, this.rayon);
	}
}
