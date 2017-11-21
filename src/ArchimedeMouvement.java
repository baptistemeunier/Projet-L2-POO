import java.awt.Point;

public class ArchimedeMouvement extends Mouvement {

	private double rayon;
	private int angle;
	private double deltaR;
	private Point destination; 

	public ArchimedeMouvement(Point dest, int rayonMax, int pas) {
		this.destination = dest;
		this.rayon = (double) rayonMax;
		this.angle = 0;
		this.deltaR = (double)(pas)/360;
	}

	@Override
	public boolean isFinish() {
		return this.rayon <= 1;
	}

	@Override
	public Point getNextPoint() {
		this.rayon -= deltaR;
		this.angle++;
		if(this.angle == 360) {
			this.angle = 0;
		}
		int x = (int) Math.round(destination.x + this.rayon * Math.cos((double)this.angle/360*2*Math.PI));
		int y = (int) Math.round(destination.y + this.rayon * Math.sin((double)this.angle/360*2*Math.PI));
		return new Point(x, y);
	}

}
