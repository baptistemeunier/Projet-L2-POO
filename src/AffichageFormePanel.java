import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class AffichageFormePanel extends JPanel {
	private FormeContainer fContainer;
	
	public AffichageFormePanel(FormeContainer fc) {
		this.fContainer = fc;
	}

	public void paintComponent(Graphics g){
		g.clearRect(0, 0, 1000, 1000);
		for(Forme f : fContainer) {
			g.setColor(f.getColor());
			f.draw(g);
			g.setColor(Color.BLACK);
		}
	}
}
