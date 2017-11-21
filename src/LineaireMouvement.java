import java.awt.Point;

public class LineaireMouvement extends Mouvement {
	protected Point origin, destination;

	public LineaireMouvement(Point o, Point d) {
		this.origin = o;
		this.destination = d;
	}

	@Override
	public boolean isFinish() {
		return origin.equals(destination);
	}
	

	@Override
	public Point getNextPoint() {
		int dx = (int) (this.destination.getX() - this.origin.getX());
		int dy = (int) (this.destination.getY() - this.origin.getY());
		if(dx < 0) {
			dx = -1;
		} else if (dx > 1) {
			dx = 1;
		}
		if(dy < 0) {
			dy = -1;
		} else if (dy > 1) {
			dy = 1;
		}
		origin = new Point(origin.x + dx, origin.y + dy);
		return origin;
	}
	
}
