import java.awt.Color;
import java.awt.Graphics;

public class Ellipse extends Forme {

	private int rayonH;
	private int rayonV;

	public Ellipse(Color c, int rh, int rv) {
		super(c);
		this.rayonH = rh;
		this.rayonV = rv;
	}

	@Override
	public void draw(Graphics g) {
		g.fillOval((int) this.centre.getX(),(int) this.centre.getY(), this.rayonH, this.rayonV);
	}

}
