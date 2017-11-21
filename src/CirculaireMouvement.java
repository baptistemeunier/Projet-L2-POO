import java.awt.Point;

public class CirculaireMouvement extends Mouvement {

	private int rayon;
	private int angle = 0;
	private Point centre;

	public CirculaireMouvement(Point o, int r) {
		this.centre = o;
		this.rayon = r;
	}

	@Override
	public boolean isFinish() {
		return this.angle == 360;
	}

	@Override
	public Point getNextPoint() {
		this.angle++;
		int x = (int) Math.round(centre.x + this.rayon * Math.cos((double)this.angle/360*2*Math.PI));
		int y = (int) Math.round(centre.y + this.rayon * Math.sin((double)this.angle/360*2*Math.PI));
		return new Point(x, y);
	}

}
